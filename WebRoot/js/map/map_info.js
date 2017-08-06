function mousePosition(ev) {
	if (ev.pageX || ev.pageY) {
		return {
			x : ev.pageX,
			y : ev.pageY
		};
	}
	return {
		x : ev.clientX + document.body.scrollLeft - document.body.clientLeft,
		y : ev.clientY + document.body.scrollTop - document.body.clientTop
	};
}

var distanceLon;
var distanceLat;

function mouseMove(ev) {

	ev = ev || window.event;
	var mousePos = mousePosition(ev);
	geoPo = new CPOINT();
	geoPo = GetLngLatFromPixel(mousePos.x, mousePos.y);
	distanceLon = mousePos.x;
	distanceLat = mousePos.y;
	document.getElementById('mapInfo').innerHTML = "北纬:"
			+ getLonLatStrByNum(geoPo.latY) + " 东经:"
			+ getLonLatStrByNum(geoPo.lngX) + " 比例尺:"
			+ msaChartObj.getScale();
}

document.onmousemove = mouseMove;

/*
 鼠标滚轮操作海图时的处理
 */
var display = document.getElementById('mapDiv');
function addScrollListener(element, wheelHandle) {
	if (typeof element != 'object')
		return;
	if (typeof wheelHandle != 'function')
		return;
	// 监测浏览器
	if (typeof arguments.callee.browser == 'undefined') {
		var user = navigator.userAgent;
		var b = {};
		b.opera = user.indexOf("Opera") > -1 && typeof window.opera == "object";
		b.khtml = (user.indexOf("KHTML") > -1
				|| user.indexOf("AppleWebKit") > -1 || user
				.indexOf("Konqueror") > -1)
				&& !b.opera;
		b.ie = user.indexOf("MSIE") > -1 && !b.opera;
		b.gecko = user.indexOf("Gecko") > -1 && !b.khtml;
		arguments.callee.browser = b;
	}
	if (element == window)
		element = document;
	if (arguments.callee.browser.ie)
		element.attachEvent('onmousewheel', wheelHandle);
	else
		element.addEventListener(
				arguments.callee.browser.gecko ? 'DOMMouseScroll'
						: 'mousewheel', wheelHandle, false);
}

function wheelHandle(e) {
	if (e.wheelDelta>0) { // 滚轮向上滚动wheelDelta值是120
		if(msaChartObj.getScale()<=80000) {
			alert("超出最大比例尺范畴！");
		}
		document.getElementById('mapInfo').innerHTML = "北纬:"
				+ parent.getLonLatStrByNum(geoPo.latY) + "东经:"
				+ parent.getLonLatStrByNum(geoPo.lngX) + "比例尺:"
				+ msaChartObj.getScale() / 2;
	} else { // 滚轮向下滚动wheelDelta值是-120
		document.getElementById('mapInfo').innerHTML = "北纬:"
				+ parent.getLonLatStrByNum(geoPo.latY) + "东经:"
				+ parent.getLonLatStrByNum(geoPo.lngX) + "比例尺:"
				+ msaChartObj.getScale() * 2;
	}
}
addScrollListener(window, wheelHandle);