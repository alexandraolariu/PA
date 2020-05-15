import javax.swing.*;
import java.awt.*;

public class DesignPanel extends JPanel {
    Insets insets;

    public DesignPanel() {
        insets = this.getInsets();

        creare();
    }

    void creare() {
        setLayout(null);
        setSize(600, 600);
        setBackground(Color.WHITE);
        setVisible(true);
    }
}
