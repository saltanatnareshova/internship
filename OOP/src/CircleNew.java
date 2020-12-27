public class CircleNew {
    private double radius;
    public CircleNew(){
        radius = 1;
    }
    public CircleNew(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "CircleNew[radius="+radius+"]";
    }
}
