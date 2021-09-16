package state;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("EraserTool mouseUp");
    }

    @Override
    public void mouseDown() {
        System.out.println("EraserTool mouseDown");
    }
}
