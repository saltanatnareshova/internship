public class MyRectangle {
    private MyPoint p1;
    private MyPoint p2;
    public MyRectangle(int x1, int y1, int x2, int y2){
        p1 = new MyPoint(x1,y1);
        p2 = new MyPoint(x2,y2);
    }
    public MyRectangle(MyPoint p1, MyPoint p2){
        this.p1=p1;
        this.p2=p2;
    }
    public String toString(){
        return "MyRectangle["+p1+"="+p1.toString()+","+p2+"="+p2.toString()+"]";
    }
}
