package classwork_8;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread{
    private Socket socket;
    private ObjectOutputStream objectOutputStream;
    private String message = "";
    private ObjectInputStream objectInputStream;

    public void run(){
        try {

            while (true) {
                socket = new Socket(InetAddress.getByName("localhost"), 8888);
                objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                Scanner scanner = new Scanner(System.in);
                System.out.print("Client Enter: ");
                message = scanner.nextLine();
                objectOutputStream.writeObject(message);

                objectInputStream = new ObjectInputStream(socket.getInputStream());
                message = (String) objectInputStream.readObject();
                System.out.println("Client:-> " + message);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
