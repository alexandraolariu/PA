import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {

    JPanel control;
    JPanel design;

    public MainFrame() {

        design = new DesignPanel();
        control = new ControlPanel((DesignPanel) design);

        creare();
    }

    private void creare() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(control, BorderLayout.NORTH);
        add(design, BorderLayout.CENTER);
        this.setSize(900, 500);
        this.setLocationByPlatform(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
