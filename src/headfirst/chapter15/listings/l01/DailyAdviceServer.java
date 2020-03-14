package headfirst.chapter15.listings.l01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    private static final String[] ADVICE_LIST = {"be brave", "be honest", "tell your chief what you really think of " +
            "him",
            "choose another haircut", "try not to eat that much"};

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    public void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            while (true) {
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAdvice() {
        return ADVICE_LIST[(int) (Math.random() * ADVICE_LIST.length)];
    }
}
