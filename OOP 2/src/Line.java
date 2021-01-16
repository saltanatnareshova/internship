public class Line {
    private Point1 begin;
    private Point1 end;
    public Line(Point1 begin, Point1 end){
        this.begin=begin;
        this.end=end;
    }
    public Line(int bx, int by, int ex, int ey){
        this.begin = new Point1(bx,by);
        this.end = new Point1(ex,ey);
    }
    public String toString(){
        return "Line[begin="+begin+", end="+end+"]";
    }
    public Point1 getBegin(){
        return begin;
    }
    public void setBegin(Point1 begin){
        this.begin=begin;
    }
    public Point1 getEnd(){
        return end;
    }
    public void setEnd(Point1 end){
        this.end=end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
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
