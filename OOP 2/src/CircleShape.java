public class CircleShape extends Shape{
    private double radius;
    public CircleShape(){
        radius=1.00;
    }
    public CircleShape(double radius){
        this.radius=radius;
    }
    public CircleShape(double r, String color, boolean filled){
        super();
        this.radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return super.toString()+", radius="+radius+"]";
    }
}
