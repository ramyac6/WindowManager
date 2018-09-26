import javax.swing.JFrame;


public class Main {
    public static final int NUMBER_OF_WINDOWS = 10;

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