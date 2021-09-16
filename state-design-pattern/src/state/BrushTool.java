package state;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush mouseUp");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush mouseDown");
    }
}
