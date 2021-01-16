public class ReactangleShape {
    private double width;
    private double length;
    public ReactangleShape(){
        width=1;
        length=1;
    }
    public ReactangleShape(double width, double length){
        this.width=width;
        this.length=length;
    }
    public ReactangleShape(double width, double length, String color, boolean filled){
        super();
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return super.toString()+", width="+width+", length="+length+"]";
    }
}
