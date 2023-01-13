package server;

public class Main {
    public static void main(String[] args) {
        Server server = new Server("localhost", 25001, "SERVER1");
        try {
            server.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
