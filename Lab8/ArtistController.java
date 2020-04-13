import java.sql.ResultSet;

public class ArtistController extends Controller {

    public void create(String name, String country) {
        Database mysql = Database.conectaredb();
        String comanda = "INSERT INTO ARTISTS VALUES( default , \"" + name + "\" ,\" " + country + "\" );";
        mysql.interogare(comanda);
    }

    public void stergere(String name) {
        Database mysql = Database.conectaredb();
        String comanda = "DELETE FROM ARTISTS WHERE NAME = '" + name + "';";
        mysql.interogare(comanda);
    }

    public void findByName(String name) {
        Database mysql = Database.conectaredb();
        String comanda = "SELECT * FROM ARTISTS WHERE NAME = '" + name + "';";
        ResultSet rezultat = mysql.interogareRes(comanda);

        if (rezultat == null) {
            System.out.println("ERROR");
        } else {
            try {
                while (rezultat.next()) {
                    System.out.println(rezultat.getString(1) + " " + rezultat.getString(2) + " " + rezultat.getString(3));
                }
            } catch (Exception ignored) {
            }

        }
    }
}
