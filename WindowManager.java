import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;


public class WindowManager {
    private ArrayList<Window> windowList;

    //Constructor, initializes windowlist
    public WindowManager (){
        this.windowList = new ArrayList<>();
    }

    //adds a window to windowlist
    public void addWindow(Window w) {
        this.windowList.add(w);
    }

    //draws all windows in windowlist, from lowest zOrder to highest
    public void drawWindows(Graphics g){
        Collections.sort(this.windowList);
        for (Window w:this.windowList) {
            w.drawWindow(g);
        }
    }

    //updates zOrders of all windows
    public void updateZOrders(Window w){
        if (w != null){
            for (Window window: windowList){
                if (window.getZOrder() < w.getZOrder()){
                    window.setZOrder(window.getZOrder() + 1);
                }
            }
            w.setZOrder(0);
        }
    }

    //redraws window that is brought to front on top
    public void bringToFront(Graphics g, Window w) {
        this.drawWindows(g);
        w.drawWindow(g);
    }

    //finds top window at mouse clicked position
    public Window findWindowByPosition(int x, int y){
        ArrayList<Window> atPosition = new ArrayList<>();

        for(Window w:this.windowList){
            if(inWindow(w,x,y)){
                atPosition.add(w);
            }
        }

        if (atPosition.size() > 0) {
            Collections.sort(atPosition);
            return atPosition.get(atPosition.size()-1);
        } else {
            return null;
        }
    }

    //checks if given point is within the window
    private boolean inWindow(Window w, int x, int y){
        return w.getX() <= x && x <= (w.getX() + w.getW()) && w.getY() <= y && y <= (w.getY() + w.getH());
    }

    public ArrayList<Window> getWindows(){
        return this.windowList;
    }

}
