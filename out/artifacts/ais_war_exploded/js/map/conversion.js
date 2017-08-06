/**
 * 经纬度转换 数值转字符串
 * */
function getLonLatStrByNum(num) {
	var numValue = parseFloat(num);
	//度
	var d = parseInt(numValue);
	//分
	var f = parseInt((numValue - d)*60);
	//秒
	var m = ((numValue - d)*60 - parseInt((numValue - d)*60)) * 60;
	return d + '°' + f + "'" + m.toFixed(2) + "\"";
}