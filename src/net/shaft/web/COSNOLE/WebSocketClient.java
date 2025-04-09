package net.shaft.web.CONSOLE;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import java.net.URI;

public class WebSocketClient extends WebSocketClient {

    public WebSocketClient(URI serverUri) {
        super(serverUri);
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("WebSocket открыт");
    }

    @Override
    public void onMessage(String message) {
        System.out.println("Получено от веб-консоли: " + message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("WebSocket закрыт: " + reason);
    }

    @Override
    public void onError(Exception ex) {
        System.err.println("Ошибка WebSocket: " + ex.getMessage());
    }
}