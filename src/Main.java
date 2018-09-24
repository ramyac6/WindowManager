import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(2000,1500);
        MyJPanel panel = new MyJPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setTitle("Window Manager");

        Graphics g = panel.getGraphics();
        panel.paintComponent(g);


       // w.drawWindow();
    }
}