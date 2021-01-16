public class TestMyTriangle {
    public static void main(String[] args){
        MyTriangle myTriangle = new MyTriangle(1,2,3,4,5,6);
        System.out.println(myTriangle.toString());
        MyTriangle myTriangle1 = new MyTriangle(1,2,3,4,7,5);
        System.out.println(myTriangle1.getPerimeter());
        System.out.println(myTriangle1.getType());

    }
}
