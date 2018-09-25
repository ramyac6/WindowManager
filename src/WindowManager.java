import java.awt.*;
import java.util.ArrayList;

public class WindowManager {
    private ArrayList<Window> windowList;

    public WindowManager (){
        this.windowList = new ArrayList<Window>();
    }

    public void addWindow(Window w) {
        this.windowList.add(w);
    }

    public void drawWindows(Graphics g){
        for (Window w:windowList) {
            w.drawWindow(g);
        }
    }

    public void bringToFront() {

    }

    public Window findWindowByPosition(){
        return new Window();
    }

    public ArrayList<Window> getWindows(){
        return this.windowList;
    }

}
