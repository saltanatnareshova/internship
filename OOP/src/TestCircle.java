public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea() + " and color of "+ c1.getColor());
        //System.out.println(c1.radius); Здесь выходит ошибка потому что у нас переменная имеет модификатор private

        Circle c2 = new Circle(2);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea() + " and color of "+ c2.getColor());

        Circle c3 = new Circle(3, "blue");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c3.getArea()  + " and color of "+ c3.getColor());

        Circle c4 = new Circle();
        c4.setRadius(6);
        c4.setColor("green");
        System.out.println("The circle has radius of "
                + c4.getRadius() + " and area of " + c4.getArea() + " and color of "+ c4.getColor());

        Circle c5 = new Circle(5);
        System.out.println(c5.toString());
        System.out.println(c5);
    }
}

