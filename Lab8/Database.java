import java.sql.*;

public class Database {
    private static Connection conexiune;
    private static Database singleton = null;


    public static Database conectaredb() {
        if (singleton == null) {
            singleton = new Database();
            try {
                conexiune = DriverManager.getConnection(Controller.getUrl(), Controller.getUsername(), Controller.getPassword());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return singleton;
    }


    public ResultSet interogareRes(String command){
        try {
            Statement myStmt = conexiune.createStatement();
            return myStmt.executeQuery(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void interogare(String command) {
        try {
            Statement myStmt = conexiune.createStatement();
            myStmt.executeUpdate(command);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
