/*初始化海图*/
function initMap(longitude, latitude, scale) {
	/*
	document.getElementById("map").style.width = document.body.offsetWidth
			- 229 + "px";
	document.getElementById("map").style.height = document.body.offsetHeight
			- 119 + "px";
	
	document.getElementById("sidebar").style.height = document.body.offsetHeight
			- 119 + "px";
	 */
	if (longitude == null || latitude == null || scale == null) {
		longitude = 120.397428;
		latitude = 38.30923;
		scale = 1280000;
	}
	var msaChartOptions = new MSAChartOptions();
	msaChartOptions.scale = scale;
	msaChartOptions.longitude = longitude;
	msaChartOptions.latitude = latitude;
	msaChartObj = new MSAChart("container", msaChartOptions);
	/*
	drawDivObj = new jsGraphics("customDiv");
	drawImgObj = new jsGraphics("imgDiv");
	document.getElementById("mapInfo").innerHTML = "比例尺:" + GetCurScale();
	 */
}