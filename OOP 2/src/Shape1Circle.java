public class Shape1Circle extends Shape1 {
    protected double radius;
    public Shape1Circle(){
        radius=1;
    }
    public Shape1Circle(double radius){
        this.radius=radius;
    }
    public Shape1Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle["+super.toString()+",radius="+radius+"]";
    }
}
