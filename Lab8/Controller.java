public abstract class Controller {
    static private String username;
    static private String password;
    static private String url;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Controller.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Controller.password = password;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Controller.url = url;
    }
}
