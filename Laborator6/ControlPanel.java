import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");
    //create all buttons (Load, Reset, Exit)
    //...TODO
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 4));
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);
        //add all buttons ...TODO
        //configure listeners for all buttons
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);
    }

    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "PNG", new File("d:/test.png"));
        } catch (IOException ex) { System.err.println(ex); }
    }

    private void load(ActionEvent e) {
        try {
            JFileChooser fileChooser=new JFileChooser();
            int errorCode=fileChooser.showOpenDialog(null);
            if(errorCode==JFileChooser.APPROVE_OPTION){
                this.frame.canvas.image=ImageIO.read(fileChooser.getSelectedFile());
            }
        } catch (IOException ex) { System.err.println(ex); }
    }

    private void reset(ActionEvent e) {
        frame.canvas.graphics.setColor(Color.white);
        frame.canvas.graphics.fillRect(0,0,800,600);
        frame.canvas.repaint();
    }

    private void exit(ActionEvent e) {
        System.exit(0);
    }
}
