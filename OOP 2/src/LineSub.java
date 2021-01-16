public class LineSub extends Point1{
    Point1 end;
    public LineSub(int bx, int by, int ex, int ey){
       super(bx,by);
       this.end = new Point1(ex,ey);
    }
    public LineSub(Point1 begin, Point1 end){
        super(begin.getX(),begin.getY());
        this.end=end;
    }
    public String toString(){
        return "LineSub[begin=("+super.toString()+"), end=("+end.toString()+")]";
    }
    public Point1 getBegin(){
        return new Point1(getX(), getY());
    }
    public void setBegin(Point1 begin){
        begin = new Point1(getX(), getY());
    }
    public Point1 getEnd(){
        return end;
    }
    public void setEnd(Point1 end){
        this.end=end;
    }
    public int getBeginX(){
        return super.getX();
    }
    public int getBeginY(){
        return super.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public void setBeginY(int y){
        super.setY(y);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setBeginXY(int x, int y){
        super.setXY(x,y);
    }
    public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }
    public int getLength(){
        int d1 = getBeginY()-getEndY();
        int d2 = getBeginX()-getEndX();
        return (int) Math.sqrt((d1*d1)+(d2*d2));
    }
    public double getGradient(){
        int d1 = getBeginY()-getEndY();
        int d2 = getBeginX()-getEndX();
        return Math.atan2(d1,d2);
    }


}
