import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Player implements Runnable {
    private String name;
    protected Board board;
    protected List<Token> tokenChoList;


    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
        tokenChoList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ";
    }

    public synchronized Token tokenExt() {
        if (!board.listTokens.isEmpty()) {
            Token token = board.listTokens.get(0);
            board.listTokens.remove(0);
            return token;
        }
        return null;
    }



    public int Progression(List<Token> listTokens) {
        System.out.println(name + " " + listTokens);
        Collections.sort(listTokens);
        Token token=new Token(1);
        int lungimeMax = 0;
        for (int i = 0; i < listTokens.size() - 1; i++)
            for (int j = i + 1; j < listTokens.size(); j++) {
                int diferenta = listTokens.get(j).getToken() - listTokens.get(i).getToken();
                if (diferenta != 0) {
                    int lungime = 2;
                    token.setToken(listTokens.get(j).getToken() + diferenta);
                    List<Token> local = new ArrayList<>();
                    local.add(listTokens.get(i));
                    local.add(listTokens.get(j));
                    while (listTokens.contains(token)) {
                        lungime++;
                        local.add(listTokens.get(listTokens.indexOf(token)));
                        token.setToken(token.getToken() + diferenta);
                    }
                    if (lungime > lungimeMax) {
                        lungimeMax = lungime;
                    }

                    return lungimeMax;
                }
          }
    }



    //@Override
    public void run(){
        Token token = tokenExt();
        while (token != null) {
            System.out.print(toString() + "a ales " + token.getToken() + ".\n");
            this.tokenChoList.add(token);
            token = tokenExt();
        }
       // Progression(tokenChoList);
    }
}
