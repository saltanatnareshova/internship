public class Shape1Rectangle extends Shape1 {
    protected double length;
    protected double width;
    public Shape1Rectangle(){
        length=1;
        width=1;
    }
    public Shape1Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public Shape1Rectangle(double length, double width, String color, boolean filled){
        super(color, filled);
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle["+super.toString() +
                "length=" + length +
                ", width=" + width +
                "]";
    }
}
