var xmlhttp;
function allSendListFn() {
	xmlhttp = createXmlHttpRequestObject();
	xmlhttp.onreadystatechange = allSendListCallBackFn;
	xmlhttp.open("post", "allSendList.action", false);
	xmlhttp.setRequestHeader("If-Modified-Since", "0");
	xmlhttp.send(null);
}

function allSendListCallBackFn() {
	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			var responseText = eval('(' + xmlhttp.responseText + ')');
			var msgVList = responseText.msgVList;
			var msgSendHtml = "<ul><li class='bf-th'><div class='bf-cbox'><input type='checkbox'></div><div class='bf-xh'>序号</div><div class='bf-bwlx'>报文类型</div><div class='bf-time'>生成时间</div><div class='bf-bfzt'>播发状态</div><div class='bf-cz'>操作</div></li>";
			for(var i=0;i<msgVList.length;i++) {
				msgSendHtml += "<li><div class='bf-cbox'><input type='checkbox'></div><div class='bf-xh'>"+(i+1)+"</div><div class='bf-bwlx'>数值预报</div><div class='bf-time'>"+msgVList[i].createTime+"</div><div class='bf-bfzt'>等待播发</div><div class='bf-cz'><a href='#'><img src='images/bf-list/ico_1.jpg'></a><a href='#'><img src='images/bf-list/ico_2.jpg'></a><a	href='#'><img src='images/bf-list/ico_3.jpg'></a><a href='#'><img src='images/bf-list/ico_4.jpg'></a><a	href='#'><img src='images/bf-list/ico_5.jpg'></a><a href='#'><img src='images/bf-list/ico_6.jpg'></a></div></li>";
			}
				document.getElementById("con_a_1").innerHTML = msgSendHtml;
		}
	}
}