public class Cylinder2 {
    private Circle base;
    private double height;
    public Cylinder2(){
        base=new Circle();
        height=1.00;
    }
    public Cylinder2(double radius){
        base = new Circle(radius);
    }
    public Cylinder2(double radius, double height){
        base = new Circle(radius);
        this.height=height;
    }
    public Cylinder2(double radius, double height, String color){
        base = new Circle(radius, color);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return base.getArea()*height;
    }
    public double getArea(){
        return (4*Math.PI*base.getRadius()*height)+base.getArea();
    }
    public String toString(){
        return "Cylinder subclass of "+super.toString()+", height="+height;
    }
}
