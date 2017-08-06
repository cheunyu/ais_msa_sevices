var xmlhttp;
function saveTemFn() {
	if (templateValidate() == false) {
		return false;
	}
	var params = "";
	var temRadios = document.getElementsByName("timeset");
	for ( var i = 0; i < temRadios.length; i++) {
		if (temRadios[i].checked) {
			if (temRadios[i].value == "INTERVAL") {
				var hh = document.getElementById("INTERVAL_H").value;
				var mm = document.getElementById("INTERVAL_M").value;
				var ss = document.getElementById("INTERVAL_S").value;
				params += "timeSet=" + temRadios[i].value + "&interval_h=" + hh
						+ "&interval_m=" + mm + "&interval_s=" + ss;
			} else {
				if (temRadios[i].value == "DEFINITE") {
					var definite_date = document
							.getElementById("DEFINITE_DATE").value;
					params += "timeSet=" + temRadios[i].value
							+ "&definite_date=" + definite_date;
				}
			}
		}
	}
	var staArr = new Array();
	var staIdx = 0;
	var stas = document.getElementsByName("ajbf_name");
	for ( var i = 0; i < stas.length; i++) {
		if (stas[i].checked) {
			staArr[staIdx++] = stas[i].value;
		}
	}
	params += "&staArr=" + staArr;
	var temName = document.getElementById("temName").value;
	var temRemark = document.getElementById("temRemark").value;
	params += "&temName=" + temName + "&temRemark=" + temRemark;
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = saveTemCallBackFn;
	xmlhttp.open("post", "station/saveTemplate.action?" + params, false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}
function saveTemCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			showTemListFn();
		}
	}
}
/*
 * 显示模板列表
 */
function showTemListFn() {
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = showTemListCallBackFn;
	xmlhttp.open("post", "station/queryTemList.action", false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}
function showTemListCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			var responseText = eval('(' + xmlhttp.responseText + ')');
			var temList = responseText.temList;
			var temListHtml = "";
			for ( var i = 0; i < temList.length; i++) {
				temListHtml += "<li><div class='dt'><input id='"
						+ temList[i].guid
						+ "' type='checkbox' name='mb_name' onClick='modifyTemListenFn();'>"
						+ temList[i].templateName + "</div><div class='dd'>"
						+ temList[i].createTime + "</div></li>";
			}
			document.getElementById("templateList").innerHTML = "";
			document.getElementById("templateList").innerHTML = temListHtml;
			/*
			 * 模板选择列表
			 */
			var temListOptionHtml = "<select id='temOption'>";
			for ( var i = 0; i < temList.length; i++) {
				temListOptionHtml += "<option id='" + temList[i].guid + "'>"
						+ temList[i].templateName + "</option>";
			}
			temListOptionHtml += "</select>";
			document.getElementById("temOptionValue").innerHTML = "";
			document.getElementById("temOptionValue").innerHTML = temListOptionHtml;
			document.getElementById("temOptionArea").innerHTML = "";
			document.getElementById("temOptionArea").innerHTML = temListOptionHtml;
		}
	}
}

function delTemplateFn() {
	var templates = document.getElementsByName("mb_name");
	var delIdx = 0;
	var delTemplates = new Array();
	for ( var i = 0; i < templates.length; i++) {
		if (templates[i].checked) {
			delTemplates[delIdx++] = templates[i].id;
		}
	}
	if(delIdx == 0) {
		alert("请选择一个模板进行删除!");
		return false;
	}
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = delTemplateCallBackFn;
	xmlhttp.open("post", "station/delTemplate.action?templateIds="
			+ delTemplates, false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}

function delTemplateCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			showTemListFn();
		}
	}
}

function modifyTemListenFn(obj) {
	var templates = document.getElementsByName("mb_name");
	var lastId;
	for ( var i = 0; i < templates.length; i++) {
		if (templates[i].checked) {
			lastId = templates[i].id;
		}
	}
	if (lastId != null) {
		xmlhttp = createXmlHttpRequestObject();
		xmlhttp.onreadystatechange = queryTemplateCallBackFn;
		xmlhttp.open("post", "station/queryTemplate.action?templateIds="
				+ lastId, false);
		xmlhttp.setRequestHeader("If-Modified-Since", "0");
		xmlhttp.send(null);
	}else {
		resetTemplate();
	}
}

/* 修改播发设置模板 */
function modifyTemplateFn() {
	var templates = document.getElementsByName("mb_name");
	var modifyIdx = 0;
	var modifyTemplateId;
	for ( var i = 0; i < templates.length; i++) {
		if (templates[i].checked) {
			modifyIdx++;
			modifyTemplateId = templates[i].id;
		}
	}
	if (modifyIdx > 1 || modifyIdx == 0) {
		alert("请选择一个模板进行修改!");
		return false;
	}

	var params = "";
	var temRadios = document.getElementsByName("timeset");
	for ( var i = 0; i < temRadios.length; i++) {
		if (temRadios[i].checked) {
			if (temRadios[i].value == "INTERVAL") {
				var hh = document.getElementById("INTERVAL_H").value;
				var mm = document.getElementById("INTERVAL_M").value;
				var ss = document.getElementById("INTERVAL_S").value;
				params += "timeSet=" + temRadios[i].value + "&interval_h=" + hh
						+ "&interval_m=" + mm + "&interval_s=" + ss;
			} else {
				if (temRadios[i].value == "DEFINITE") {
					var definite_date = document
							.getElementById("DEFINITE_DATE").value;
					params += "timeSet=" + temRadios[i].value
							+ "&definite_date=" + definite_date;
				}
			}
		}
	}
	var staArr = new Array();
	var staIdx = 0;
	var stas = document.getElementsByName("ajbf_name");
	for ( var i = 0; i < stas.length; i++) {
		if (stas[i].checked) {
			staArr[staIdx++] = stas[i].value;
		}
	}
	params += "&staArr=" + staArr+"&templateIds=" + modifyTemplateId;
	var temName = document.getElementById("temName").value;
	var temRemark = document.getElementById("temRemark").value;
	params += "&temName=" + temName + "&temRemark=" + temRemark;
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = modifyTemCallBackFn;
	xmlhttp.open("post", "station/modifyTemplate.action?" + params, false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}

function modifyTemCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			resetTemplate();
			showTemListFn();
		}
	}
}

function queryTemplateCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			/* 表单赋值 */
			var responseText = eval('(' + xmlhttp.responseText + ')');
			var templateObj = responseText.template;
			if (templateObj != null) {
				if (templateObj.intervalTime > 0) {
					document.getElementById("INTERVAL_RADIO").checked = true;
					var hh = Math.floor(templateObj.intervalTime / 3600);
					var mm = Math.floor(templateObj.intervalTime % 3600 / 60);
					var ss = templateObj.intervalTime % 3600 % 60;
					document.getElementById("INTERVAL_H").value = hh;
					document.getElementById("INTERVAL_M").value = mm;
					document.getElementById("INTERVAL_S").value = ss;
					document.getElementById("DEFINITE_DATE").value = "";
				} else {
					document.getElementById("INTERVAL_H").value = "";
					document.getElementById("INTERVAL_M").value = "";
					document.getElementById("INTERVAL_S").value = "";
					document.getElementById("DEFINITE_RADIO").checked = true;
					document.getElementById("DEFINITE_DATE").value = templateObj.definite;
				}
				for ( var i = 0; i < templateObj.stations.length; i++) {
					document
							.getElementById(templateObj.stations[i].stationName).checked = true;
				}
				document.getElementById("temName").value = templateObj.templateName;
				if (templateObj.remark == null) {
					document.getElementById("temRemark").value = "";
				} else {
					document.getElementById("temRemark").value = templateObj.remark;
				}
			}
		}
	}
}

function modifyTemplateCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			showTemListFn();
		}
	}
}

/* 清空表单 */
function resetTemplate() {
	document.getElementById("INTERVAL_RADIO").checked = false;
	document.getElementById("DEFINITE_RADIO").checked = false;
	document.getElementById("INTERVAL_H").value = "";
	document.getElementById("INTERVAL_M").value = "";
	document.getElementById("INTERVAL_S").value = "";
	document.getElementById("DEFINITE_DATE").value = "";
	var stas = document.getElementsByName("ajbf_name");
	for ( var i = 0; i < stas.length; i++) {
		stas[i].checked = false;
	}
	document.getElementById("temName").value = "";
	document.getElementById("temRemark").value = "";
	var templates = document.getElementsByName("mb_name");
	for ( var i = 0; i < templates.length; i++) {
		templates[i].checked = false;
	}
}

/* 时间频度选择清空 */
function radioChooseFn() {
	var intRadio = document.getElementById("INTERVAL_RADIO");
	if (intRadio.checked == true) {
		document.getElementById("DEFINITE_DATE").value = "";
	} else {
		document.getElementById("INTERVAL_H").value = "";
		document.getElementById("INTERVAL_M").value = "";
		document.getElementById("INTERVAL_S").value = "";
	}
}