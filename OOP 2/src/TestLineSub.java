public class TestLineSub {
    public static void main(String[] args) {
        Point1 point1 = new Point1(1,2);
        Point1 point2 = new Point1(3,5);
        LineSub line = new LineSub(10, 20, 20, 20);
        System.out.println(line);
        line.setBegin(point1);
        line.setEnd(point2);
        System.out.println(line.getLength());
        System.out.println(line.getBegin());
        System.out.println(line.getBeginX());
        System.out.println(line.getEnd());

    }
}
