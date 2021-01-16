public class ResizableCircle extends Circle2 implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void resize(int percent) {
        radius = (radius*percent)/100;
    }
}
