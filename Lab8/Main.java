import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Controller.setUsername("root");
        Controller.setPassword("Alexgiginana13");
        Controller.setUrl("jdbc:mysql://localhost:3306/musicalbums");
        Database bazaDate = Database.conectaredb();


        ArtistController artist = new ArtistController();
        artist.create("Alex", "Romania");
        artist.findByName("Alex");
        artist.create("Ion", "Romania");
        //artist.stergere("Ion");



        AlbumController album=new AlbumController();
        album.create("hello","16","1900");
        album.create("gfjgdsj","16","1900");
        album.findByArtist(16);
        //album.stergere("hello");
    }
}
