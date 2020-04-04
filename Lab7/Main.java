
public class Game {
    public void main(){
        Board board=new Board(20,6);
        Runnable Jucator1 = new Player("Alex",board);
        Runnable Jucator2 = new Player("Mihai",board);
        Runnable Jucator3 = new Player("Ion",board);
        Runnable Jucator4 = new Player("Andrei",board);
        Runnable Jucator5 = new Player("Andreea",board);
        Runnable Jucator6 = new Player("Mihaela",board);
        new Thread(Jucator1).start();
        new Thread(Jucator2).start();
        new Thread(Jucator3).start();
        new Thread(Jucator4).start();
        new Thread(Jucator5).start();
        new Thread(Jucator6).start();
}
}
