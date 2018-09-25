import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1500,1500);
        MyJPanel panel = new MyJPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setTitle("Window Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}