package headfirst.chapter15.listings.l07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class VerySimpleChatServer {
    ArrayList<PrintWriter> clientOutputStreams;

    public static void main(String[] args) {
        new VerySimpleChatServer().go();
    }

    public void go() {
        clientOutputStreams = new ArrayList<>();
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStreams.add(writer);
                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void tellEveryone(String message) {
        for (PrintWriter writer : clientOutputStreams) {
            try {
                writer.println(message);
                writer.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket socket;

        public ClientHandler(Socket clientSocket) {
            try {
                socket = clientSocket;
                InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
