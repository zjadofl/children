package test.com.idle.handler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class EchoHandler extends TextWebSocketHandler {
	
	//�α������� �����
	Map<String, WebSocketSession> users = new ConcurrentHashMap<String, WebSocketSession>();
	
	//Ŭ���̾�Ʈ�� ������ �����
	/*@Override
	public void afterConnectionEstablished(WebSocketSession session) th {
		
	}*/
}
