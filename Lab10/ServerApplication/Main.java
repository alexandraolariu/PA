import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        try {
            ServerGame server = new ServerGame();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
