var xmlhttp;
var ncDateTimeHTML;
function getNetCdfDateTimeFn() {
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = netCdfDateTimeCallBackFn;
	xmlhttp.open("post", "broadcast/netcdfDateTime.action", false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}

function netCdfDateTimeCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			var responseText = eval('(' + xmlhttp.responseText + ')');
			var ncDateTimeList = responseText.netCdfDateTimeList;
			for (var i = 0; i < ncDateTimeList.length; i++) {
				ncDateTimeHTML += " <option>" + ncDateTimeList[i]
						+ "时</option>";
			}
		}
	}
}

function mmDateTimeFn() {
	document.getElementById('mmDateTime').innerHTML = ncDateTimeHTML;
}

function mefDateTimeFn() {
	document.getElementById('mefDateTime').innerHTML = ncDateTimeHTML;
}