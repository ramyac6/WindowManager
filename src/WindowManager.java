import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WindowManager {
    private ArrayList<Window> windowList;

    public WindowManager (){
        this.windowList = new ArrayList<Window>();
    }

    public void addWindow() {
        Window w = new Window();
        this.windowList.add(w);
    }

    public void drawWindows(Graphics g){
        for (Window w : windowList) {
            w.drawWindow(g);
        }
    }

    public void bringToFront() {

    }

    public Window findWindowByPosition(){
        return new Window();
    }

    public List<Window> getWindows(){
        return this.windowList;
    }

}
