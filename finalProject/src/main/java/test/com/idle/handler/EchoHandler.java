package test.com.idle.handler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class EchoHandler extends TextWebSocketHandler {
	
	//로그인중인 사용자
	Map<String, WebSocketSession> users = new ConcurrentHashMap<String, WebSocketSession>();
	
	//클라이언트가 서버로 연결시
	/*@Override
	public void afterConnectionEstablished(WebSocketSession session) th {
		
	}*/
}
