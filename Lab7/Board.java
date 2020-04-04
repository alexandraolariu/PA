import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
    private int nr_token;
    private int players;
    protected List<Token> listTokens;

    public Board(int nr_token, int players) {
        this.nr_token = nr_token;
        this.players = players;
        listTokens = new ArrayList<>();

        for(int i=1;i<=nr_token;i++){
            Token tok=new Token(nr_token);
            listTokens.add(tok);
        }
        Collections.shuffle(listTokens);
    }

    public int getNr_token() {
        return nr_token;
    }

    public void setNr_token(int nr_token) {
        this.nr_token = nr_token;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public List<Token> getListTokens() {
        return listTokens;
    }

    public void setListTokens(List<Token> listTokens) {
        this.listTokens = listTokens;
    }
}
