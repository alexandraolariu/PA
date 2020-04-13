import java.sql.ResultSet;

public class AlbumController extends Controller {


    public void create(String name, String artistId,String releaseYear) {
        Database mysql = Database.conectaredb();
        String comanda = "INSERT INTO ALBUMS VALUES ( default , \"" + name + "\" , " + artistId + " , " + releaseYear + " )";
        mysql.interogare(comanda);
    }

    public void stergere(String name) {
        Database mysql = Database.conectaredb();
        String comanda = "DELETE FROM ALBUMS WHERE NAME = '" + name + "'";
        mysql.interogare(comanda);
    }

    public void findByArtist(int artistId) {
        Database mysql = Database.conectaredb();
        String command = "SELECT * FROM ALBUMS WHERE ARTIST_ID= " + artistId;
        ResultSet rezultat = mysql.interogareRes(command);
        if (rezultat == null) {
            System.out.println("ERROR");
        } else {
            try {
                while (rezultat.next()) {
                    System.out.println(rezultat.getString(1) + " " + rezultat.getString(2) + " " + rezultat.getString(3) +" "+ rezultat.getString(4));
                }
            } catch (Exception ignored) {
            }

        }

    }

}
