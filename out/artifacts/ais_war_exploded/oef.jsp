<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>海洋环境预报测试页面</title>
</head>
<body>
	<h1 style="font-size:200%">海洋环境预报测试页面</h1>
	<form action="sendMessage/sendOefAction.action">
		<input type="radio" name="oefVo.messageNo" value="6">6号报文</input>
		信源台站<input type="text" name="oefVo.messageSix.source_id"></input>
		目的地台站<input type="text" name="oefVo.messageSix.destination_id"></input>
		<input type="radio" name="oefVo.messageNo" value="8">8号报文</input><br>
		预报时间 
		<select name="oefVo.forecastTime">
			<option>请选择...</option>
			<c:forEach var="i" begin="0" end="23">
				<option><c:out value="${i}"></c:out></option>
			</c:forEach>
		</select><br>
		<input type="radio" name="oefVo.areaFlag" value="0">渤海区域</input>
		<input type="radio" name="oefVo.areaFlag" value="1">自定义区域</input><br>
		<c:forEach var="i" begin="1" end="15">
				经度
				<input type="text" name="oefVo.longitudeDList">°</input>
				<input type="text" name="oefVo.longitudeMList">'</input>
				<input type="text" name="oefVo.longitudeSList">"</input>
				纬度
				<input type="text" name="oefVo.latitudeDList">°</input>
				<input type="text" name="oefVo.latitudeMList">'</input>
				<input type="text" name="oefVo.latitudeSList">"</input>
				<!-- 
				<input type="text" name="oefVo.waterSpeedList">流速</input>
				<input type="text" name="oefVo.waterDirectionList">流向</input>
				<input type="text" name="oefVo.waveHsList">浪高</input>
				<input type="text" name="oefVo.waveDirectionList">浪向</input>
				<input type="text" name="oefVo.waterTemperatureList">海温</input>
				 -->
				<br>
			</c:forEach>
			<input type="submit" value="发送"></input>
	</form>
</body>
</html>