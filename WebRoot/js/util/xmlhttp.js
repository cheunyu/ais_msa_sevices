// 创建一个 XMLHTTPREQUEST 实例
function createXmlHttpRequestObject(){
	var xmlHttp;
	//这将在所有浏览器上工作，除了IE6和老版本
	try{
		//尝试创建XMLHttpRequest对象
		xmlHttp = new XMLHttpRequest();
	}
	catch (e){
		//假定是IE6或者老版本
		var XmlHttpVersions = new Array("MSXML2.XMLHTTP.6.0",
		"MSXML2.XMLHTTP.5.0",
		"MSXML2.XMLHTTP.4.0",
		"MSXML2.XMLHTTP.3.0",
		"MSXML2.XMLHTTP",
		"Microsoft.XMLHTTP");
		//尝试每一个id号直到一个工作
		for ( var i = 0; i < XmlHttpVersions.length && !xmlHttp; i++){
			try{
				xmlHttp = new ActiveXObject(XmlHttpVersions[i]);
			}catch (e) {
			}
		}
	}
	//返回创建的对象或者显示一个错误消息
	if (!xmlHttp)
		alert("Error creating the XMLHttpRequest object.");
	else
		return xmlHttp;
}