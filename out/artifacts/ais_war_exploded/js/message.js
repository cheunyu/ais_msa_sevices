
var xmlhttp;
/*
	生成数值预报
*/
function createMsgValueFn() {
	/*模板选择*/
	var temOptions = document.getElementById("temOption");
	var temOption = temOptions.options[temOptions.selectedIndex].id;
	/*经度数值*/
	var lons = document.getElementsByName("sz-jd[]");
	var lonArr = new Array();
	var lonIdx = 0;
	for (var i = 0; i < lons.length; i++) {
		if (lons[i].value.length > 0) {
			lonArr[lonIdx++] = lons[i].value;
		}
	}
	/*纬度数值*/
	var lats = document.getElementsByName("sz-wd[]");
	var latArr = new Array();
	var latIdx = 0;
	for (var i = 0; i < lats.length; i++) {
		if (lats[i].value.length > 0) {
			latArr[latIdx++] = lats[i].value;
		}
	}
	/*数据类型*/
	var dataTypeArr = new Array();
	var dataTypeIdx = 0;
	var dataTypes = document.getElementsByName("dataTypeValue");
	for (var i = 0; i < dataTypes.length; i++) {
		if (dataTypes[i].checked) {
			dataTypeArr[dataTypeIdx++] = dataTypes[i].value;
		}
	}
	/*数据时间*/
	var dataTimes = document.getElementsByName("dataTimeValue");
	var dataTime = 0;
	for (var i = 0; i < dataTimes.length; i++) {
		if (dataTimes[i].checked) {
			dataTime = dataTimes[i].value;
		}
	}
	var param = "temOption=" + temOption + "&lonArr=" + lonArr + "&latArr=" + latArr + "&dataTypeArr=" + dataTypeArr + "&dataTime=" + dataTime;
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = createMsgValueCallBackFn;
	xmlhttp.open("post", "station/saveMsgV.action?"+param, false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}
function createMsgValueCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
		}
	}
}

