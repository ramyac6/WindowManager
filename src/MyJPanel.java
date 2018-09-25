import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJPanel extends JPanel implements MouseListener {
    private WindowManager manager;

    public MyJPanel() {
        this.manager = new WindowManager();
        Window w;

        //adds 10 windows to manager
        for(int i = 0; i<Main.NUMBER_OF_WINDOWS; i++){
            w = new Window();
            this.manager.addWindow(w);
        }

        //sets zOrder for all windows
        for(int i = 0; i<Main.NUMBER_OF_WINDOWS; i++){
            this.manager.getWindows().get(i).setZOrder(this.manager.getWindows().size()-i-1);
        }

        addMouseListener(this);

    }

    @Override
    public void paintComponent(Graphics g) {
        this.manager.drawWindows(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Window w;
        int x = e.getX();
        int y = e.getY();
        System.out.println(x + " " + y);
        w = manager.findWindowByPosition(x, y);
        if(w != null){
            Graphics g;
            g = this.getGraphics();
            manager.bringToFront(g, w);
        }
        manager.updateZOrders(w);
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
