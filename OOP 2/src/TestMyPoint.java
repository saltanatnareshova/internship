public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println(p1);
        p1.setX(1);
        p1.setY(2);
        System.out.println("p1 x " + p1.getX());
        System.out.println("p1 y " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());
        MyPoint[] myPoints = new MyPoint[20];
        for (int i = 0; i < myPoints.length; i++) {
            myPoints[0] = new MyPoint(1, 2);
            myPoints[1] = new MyPoint(2, 2);
            myPoints[2] = new MyPoint(3, 2);
            myPoints[3] = new MyPoint(4, 2);
            myPoints[4] = new MyPoint(6, 2);
            myPoints[5] = new MyPoint(7, 2);
            myPoints[6] = new MyPoint(8, 2);
            myPoints[7] = new MyPoint(9, 2);
            myPoints[8] = new MyPoint(0, 2);
            myPoints[9] = new MyPoint(10, 2);
            myPoints[10] = new MyPoint(10, 2);
            myPoints[11] = new MyPoint(10, 2);
            myPoints[12] = new MyPoint(10, 2);
            myPoints[13] = new MyPoint(10, 2);
            myPoints[14] = new MyPoint(10, 2);
            myPoints[15] = new MyPoint(10, 2);
            myPoints[16] = new MyPoint(10, 2);
            myPoints[17] = new MyPoint(10, 2);
            myPoints[18] = new MyPoint(9, 2);
            myPoints[19] = new MyPoint(10, 2);

            System.out.println(myPoints[i]);
        }
        for (int i = 0; i < myPoints.length; i++) {
            if ((i + 1) % 10 == 0) System.out.println(myPoints[i]);
        }
    }
}
