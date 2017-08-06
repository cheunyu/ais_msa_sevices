var webSocket = new WebSocket('ws://localhost:8080/ws/websocket');

webSocket.onerror = function(event) {
	onError(event)
};

webSocket.onopen = function(event) {
	onOpen(event)
};

webSocket.onmessage = function(event) {
	onMessage(event)
};

webSocket.onclose = function(event) {
	onClose(event)
};

function onMessage(event) {
	document.getElementById('messages').innerHTML += '<br />' + event.data;
}

function onOpen(event) {
	document.getElementById('messages').innerHTML = 'Connected to WebSocket server.';
}

function onClose(evt) {
	document.getElementById('messages').innerHTML = 'Disconnected';
}

function onError(event) {
	alert(event.data);
}


function start() {
	webSocket.send('hello');
	return false;
}
