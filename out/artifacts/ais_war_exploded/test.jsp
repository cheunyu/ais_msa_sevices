<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>test page</title>
</head>
<body>
	<form action="sendMessage/omf.action" method="post">
		<input type="text" name="omf.dac" value="412">DAC</input><br>
		<input type="text" name="omf.ms.repeat">转发指示符</input><br>
		<input type="text" name="omf.ms.source_id">信源ID</input><br>
		<input type="text" name="omf.ms.sequence_number">序列编号</input><br>
		<input type="text" name="omf.ms.destination_id">目的ID</input><br>
		<input type="text" name="omf.ms.retransmit_flag">重发标志</input><br>
		<input type="text" name="omf.ms.spare">备用</input><br>
		<input type="submit" value="submit"></input>
	</form>
</body>
</html>