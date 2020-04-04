import java.util.Objects;
import java.util.Random;

public class Token {
    private Integer token;
    Random rand = new Random();

    public Token(Integer token) {
        this.token = rand.nextInt(token) + 1;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token=" + token +
                ", rand=" + rand +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token1 = (Token) o;
        return Objects.equals(token, token1.token) &&
                Objects.equals(rand, token1.rand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, rand);
    }
}
