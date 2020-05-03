import java.io.*;
import java.net.*;

public class ServerGame {

    public ServerGame() throws IOException {
        {
            ServerSocket ss = new ServerSocket(5056);

            while (true) {
                Socket s = null;

                try {
                    s = ss.accept();

                    System.out.println("A new client is connected : " + s);
                    
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

                    System.out.println("Assigning new thread for this client");
                    
                    Thread t = new ClientThread(s, dis, dos);

                    t.start();

                } catch (Exception e) {
                    s.close();
                    e.printStackTrace();
                }
            }
        }
    }
}
