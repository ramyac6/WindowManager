import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {
    private WindowManager manager;

    public MyJPanel() {
        this.manager = new WindowManager();
        for(int i = 0; i<10;i++){
            this.manager.addWindow();
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.manager.drawWindows(g);
    }
}
