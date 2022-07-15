package classwork_8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {
    private Socket socket;
    private ObjectInputStream objectInputStream;
    private String message = "";
    private ObjectOutputStream objectOutputStream;

    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(8888);

            while(true) {
                socket = serverSocket.accept();
                objectInputStream = new ObjectInputStream(socket.getInputStream());
                message = (String) objectInputStream.readObject();
                System.out.println("Server:-> " + message);

                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                Scanner scanner = new Scanner(System.in);
                System.out.println("Server Enter: ");
                message = scanner.nextLine();
                objectOutputStream.writeObject(message);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
