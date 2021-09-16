package state;

public class Main {

    // Open closed Principle : Classes must be open for extension and closed for modification

    public static void main(String[] args) {

        Canvas c = new Canvas();
        c.setCurrentTool(new SelectionTool());
        c.mouseDown();
        c.setCurrentTool(new EraserTool());
        c.mouseDown();
        c.mouseUp();
        c.setCurrentTool(new BrushTool());
        c.mouseUp();
    }
}
