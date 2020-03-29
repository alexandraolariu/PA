import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ConfigPanel extends JPanel {
    JLabel sidesLabel;
    final MainFrame frame;
    JLabel colorLabel; // we’re drawing regular polygons
    JSpinner sidesField; // number of sides
    JComboBox colorCombo;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //create the label and the spinner
        sidesLabel = new JLabel("Number of sides:");
        colorLabel = new JLabel("Color:");
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        sidesField.setValue(6); //default number of sides
        //create the colorCombo, containing the values: Random and Black
        String[] colors={"RANDOM","BLACK"};
        colorCombo=new JComboBox(colors);
        //...TODO
        add(sidesLabel); //JPanel uses FlowLayout by default
        add(sidesField);
        add(colorLabel);
        add(colorCombo);
    }

    public int getSidesvalue() {
        int value = (Integer) sidesField.getValue();
        return value;
    }

    public int getColor() {
        String color = colorCombo.getSelectedItem().toString();
        if(color=="BLACK")
            return 1;
        else
            return 0;
    }
}
