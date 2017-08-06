var xmlhttp;
function allStationFun() {
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = allStationCallBackFun;
	xmlhttp.open("post", "station/allStaNames.action", false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}

function allStationCallBackFun() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			var responseText = eval('(' + xmlhttp.responseText + ')');
			var staNameList = responseText.staNameList;
			var staNameHtmlData = "<ul>";
			for ( var i = 0; i < staNameList.length; i++) {
				staNameHtmlData += "<li><span>"
						+ staNameList[i]
						+ "</span><input type='checkbox' class='ipt_checkBox' name='aj_name' value='"+staNameList[i]+"'></li>";
			}
			staNameHtmlData += "</ul>";
			document.getElementById('staNames').innerHTML = "";
			document.getElementById('staNames').innerHTML = staNameHtmlData;
			/*
				模板中的基站列表
			*/
			var staNameHtmlTemData = "<ul>";
			for ( var i = 0; i < staNameList.length; i++) {
				staNameHtmlTemData += "<li><input type='checkbox' id='" + staNameList[i] + "' name='ajbf_name' value='"+staNameList[i]+"'> "+staNameList[i]+"</li>";
			}
			staNameHtmlTemData += "</ul>";
			document.getElementById('temStas').innerHTML = "";
			document.getElementById('temStas').innerHTML = staNameHtmlTemData;
		}
	}
}

function delFn() {
	var stas = document.getElementsByName("aj_name");
	for ( var i = 0; i < stas.length; i++) {
		if (stas[i].checked) {
			alert(stas[i].value);
		}
	}
}

function delStationFun() {
	var staArr = new Array();
	var staIdx = 0;
	var stas = document.getElementsByName("aj_name");
	for ( var i = 0; i < stas.length; i++) {
		if (stas[i].checked) {
			staArr[staIdx++] = stas[i].value;
		}
	}
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = delStationCallBackFun;
	xmlhttp.open("post", "station/delStaNames.action?staArr="+staArr, false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}

function delStationCallBackFun() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			allStationFun();
			temStaFn();
		}
	}
}
function modFn() {
	alert("修改");
}