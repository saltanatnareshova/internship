import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args){
        MyCircle myCircle = new MyCircle(1,3,5);
        myCircle.setCenterX(5);
        myCircle.setCenterY(1);
        myCircle.setRadius(5);
        System.out.println(myCircle.getCenterX());
        System.out.println(myCircle.getCenterY());
        System.out.println(myCircle.getRadius());
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCenter());
        System.out.println(Arrays.toString(myCircle.getCenterXY()));
        System.out.println(myCircle.getCircumference());
        MyCircle myCircle1 = new MyCircle(1,2,3);
        System.out.println(myCircle.distance(myCircle1));
        System.out.println(myCircle.toString());
    }
}
