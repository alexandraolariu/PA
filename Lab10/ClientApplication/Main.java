import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        ClientGame client=new ClientGame();
        try {
            ClientGame.connect(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

