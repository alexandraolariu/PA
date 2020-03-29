
import java.io.*;
import java.awt.Desktop;

public class CatalogUtil {
    public static void save(Catalog catalog) throws IOException {
        try (var oos = new ObjectOutputStream(new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }

    public static Catalog load(String path) {
        Catalog inCatalog = new Catalog();
        try {
            FileInputStream catalogFile = new FileInputStream(path);
            ObjectInputStream catalogObject = new ObjectInputStream(catalogFile);
            inCatalog = (Catalog) catalogObject.readObject();

            catalogObject.close();
            catalogFile.close();
        } catch (Exception exception) {
            System.out.println("Exception load" + exception);
        }
        return inCatalog;
    }

    public static void view(Document doc) {
        try {
            File file = new File(doc.getLocation());
            Desktop.getDesktop().open(file);
        } catch (Exception exception) {
            System.out.println("exception view" + exception);
        }
    }
}
