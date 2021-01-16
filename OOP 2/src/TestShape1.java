public class TestShape1 {
    public static void main(String[] args){
        Shape1 shape1 = new Shape1Circle(5.5, "red", false);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getColor());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.isFilled());
       // System.out.println(shape1.getRadius()); there is a mistake because we did polymorphism

        Shape1Circle shape1Circle = (Shape1Circle)shape1;
        System.out.println(shape1Circle.getArea());
        System.out.println(shape1Circle.getPerimeter());
        System.out.println(shape1Circle.getRadius());
        System.out.println(shape1Circle.getColor());
        System.out.println(shape1Circle.isFilled());

        //Shape1 shape11 = new Shape1(); it is abstract
        Shape1 shape11 = new Shape1Rectangle(1,1, "red", false);
        System.out.println(shape11);
        System.out.println(shape11.getPerimeter());
        System.out.println(shape11.getColor());
        System.out.println(shape11.getArea());
        //System.out.println(shape11.getLength()); polymorphism

        Shape1Rectangle shape1Rectangle = (Shape1Rectangle) shape11;
        System.out.println(shape1Rectangle.getLength());

        Shape1 shape12 = new Shape1Square(1.1);
        System.out.println(shape12);
        System.out.println(shape12.getArea());
        System.out.println(shape12.getColor());
        //System.out.println(shape12.getSide());

        Shape1Rectangle shape1Rectangle1 = (Shape1Rectangle) shape12;
       // System.out.println(shape1Rectangle1.getSide());
        Shape1Square shape1Square = (Shape1Square) shape1Rectangle1;
        System.out.println(shape1Square.getSide());
    }
}
