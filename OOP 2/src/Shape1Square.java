public class Shape1Square extends Shape1Rectangle{
    public Shape1Square(){}
    public Shape1Square(double side){
        super.length=side;
    }
    public Shape1Square(double side, String color, boolean filled){
        super(side, side,color, filled);
    }
    public double getSide(){
        return super.length;
    }
    public void setSide(double side){
        super.length=side;
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square["+super.toString()+"]";
    }

}
