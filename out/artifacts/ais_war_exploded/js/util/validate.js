/* 播发设置表单验证 */
function templateValidate() {
	var flag = false;
	//时间频度校验
	var temRadios = document.getElementsByName("timeset");
	var timeFlag = true;
	var timeSelectFlag = false;
	for ( var i = 0; i < temRadios.length; i++) {
		if (temRadios[i].checked) {
			timeSelectFlag = true;
			//间隔时间校验
			if (temRadios[i].value == "INTERVAL") {
				//正整数正则
				var patrn =/^\d+$/;
				//小时校验
				i_h = document.getElementById("INTERVAL_H").value;
				if (patrn.test(i_h)&&i_h>=0&&i_h<=24) {
				}else{
					timeFlag = false;
					alert("间隔发送时间:小时设置错误!");
				}
				//分钟校验
				i_m = document.getElementById("INTERVAL_M").value;
				if (patrn.test(i_m)&&i_m>=0&&i_m<=59) {
				}else{
					timeFlag = false;
					alert("间隔发送时间:分钟设置错误!");
				}
				//秒校验
				i_s = document.getElementById("INTERVAL_S").value;
				if (patrn.test(i_s)&&i_s>=0&&i_s<=59) {
				}else{
					timeFlag = false;
					alert("间隔发送时间:秒设置错误!");
				}
			}
			//定时发送校验
			if (temRadios[i].value == "DEFINITE") { 
				var definite = document.getElementById("DEFINITE_DATE").value;
				if(definite==""||definite==null) {
					timeFlag = false;
					alert("定时时间不能为空!");
				}
			}
		}
	}
	if(!timeSelectFlag) {
		timeFlag = false;
		alert("请设置时间频度参数!");
	}
	//岸基播发设置校验
	var stas = document.getElementsByName("ajbf_name");
	var staFlag = false;
	for (var i = 0; i < stas.length; i++) {
		if (stas[i].checked) {
			staFlag = true;
		}
	}
	if(!staFlag) {
		staFlag = false;
		alert("请设置岸基播发参数!");
	}
	//模板名校验
	var temFlag = true;
	var temName = document.getElementById("temName");
	if(temName.value==""||temName.value==null) {
		temFlag = false;
		alert("模板名不能为空!");
	}
	if(timeFlag==true&&staFlag==true&&temFlag==true) {
		flag = true;
	}
	return flag;
}