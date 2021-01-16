public class TestLine {
    public static void main(String[] args){
        Line line= new Line(10,10,20,20);
        System.out.println(line);
        Point1 point1 = new Point1(1,2);
        Point1 point11 = new Point1(3,4);
        Line line1 = new Line(point1,point11);
        System.out.println(line1);
    }
}
