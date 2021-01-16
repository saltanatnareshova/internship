public class MyCircle {
    private MyPoint center;
    private int radius;
    public MyCircle(){

    }
    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterX(int x){
        center = new MyPoint(x,center.getY());
    }
    public void setCenterY(int y){
        center = new MyPoint(center.getX(),y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }
    public String toString(){
        return "MyCircle[radius="+radius+", center="+ center.toString()+"]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return Math.PI*2*radius;
    }
    public double distance(MyCircle a){
        return center.distance(a.center);
    }




}
