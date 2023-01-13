package server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Server {
    public final String HOSTNAME;
    public final int PORT;
    public final String name;
    private ServerSocketChannel serverChannel;


    public Server(String HOSTNAME, int PORT, String name) {
        this.HOSTNAME = HOSTNAME;
        this.PORT = PORT;
        this.name = name;
    }

    public void start() throws Exception {
        if (serverChannel == null || !serverChannel.isOpen()) {
            work();
        } else {
            throw new Exception("The server is already running.");
        }
    }

    public void work() throws IOException {
        serverChannel = ServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress(HOSTNAME, PORT));

        while (true) {
            try (SocketChannel socketChannel = serverChannel.accept()) {
                final ByteBuffer inputBuffer = ByteBuffer.allocate(2 << 10);
                while (socketChannel.isConnected()) {
                    int bytesCount = socketChannel.read(inputBuffer);
                    if (bytesCount == -1) break;
                    String msg = new String(inputBuffer.array(), 0, bytesCount, StandardCharsets.UTF_8);
                    inputBuffer.clear();
                    System.out.println(name + "Income Message: " + msg);
                    msg = msg.replace(" ", "");
                    System.out.println(name + "Outcome Message: " + msg);
                    socketChannel.write(ByteBuffer.wrap((msg).getBytes(StandardCharsets.UTF_8)));
                }
            }
        }
    }
}
