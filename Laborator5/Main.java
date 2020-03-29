import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        Main app = new Main();
        try {
            app.testCreateSave();
        } catch (IOException e) {
            e.printStackTrace();
        }
        app.testLoadView();
    }

    private void testCreateSave() throws IOException {
        Catalog catalog = new Catalog("JavaResources", "D:\\FACULTATE\\Semestru 2\\Programareavansatacatalog.ser");
        Document doc = new Document("java1", "Java Course 1", "D:\\FACULTATE\\Semestru 2\\Programare avansata\\lab5\\lab5.iml");
        doc.addTag("type", "Slides");
        catalog.add(doc);
        CatalogUtil.save(catalog);

    }

    private void testLoadView() {
        Catalog catalog = CatalogUtil.load("D:\\FACULTATE\\Semestru 2\\Programareavansatacatalog.ser");
        Document doc = catalog.findById("java1");
        CatalogUtil.view(doc);
    }
}

