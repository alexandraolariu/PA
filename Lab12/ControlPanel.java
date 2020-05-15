import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    JTextField textComponentName;
    JTextField textWidth;
    JTextField textHeight;
    JTextField textText;

    JButton newComponent;

    DesignPanel designPanel;

    JPanel rootPanel;
    JPanel dimensiuni;


    public ControlPanel(DesignPanel designPanel) {
        this.designPanel = designPanel;

        newComponent = new JButton("CREARE");

        textComponentName = new JTextField(10);
        textWidth = new JTextField(10);
        textHeight = new JTextField(10);
        textText = new JTextField(15);

        dimensiuni = new JPanel();
        rootPanel = new JPanel();

        rootPanel.setVisible(true);
        dimensiuni.setVisible(true);

        this.setVisible(true);


        dimensiuni.setLayout(new FlowLayout());
        dimensiuni.add(new JLabel("INALTIME:"));
        dimensiuni.add(textWidth);
        dimensiuni.add(new JLabel("LATIME:"));
        dimensiuni.add(textHeight);
        dimensiuni.add(new JLabel("TEXT:"));
        dimensiuni.add(textText);
        rootPanel.setLayout(new FlowLayout());


        setLayout(new FlowLayout());

        textHeight.setSize(100, 30);
        textWidth.setSize(100, 30);

        rootPanel.add(dimensiuni, BorderLayout.NORTH);
        rootPanel.add(new JLabel("NUME CLASA:"));
        rootPanel.add(textComponentName);

        rootPanel.add(newComponent, BorderLayout.CENTER);
        add(rootPanel);

    }
}
