import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {
    public WindowManager manager;

    public MyJPanel() {
        this.manager = new WindowManager();
        Window w;

        for(int i = 0; i<10; i++){
            w = new Window();
            this.manager.addWindow(w);
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        //super.paintComponent(g);
        manager.drawWindows(g);
    }
}