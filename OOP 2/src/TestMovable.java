public class TestMovable {
    public static void main(String[] args) {
        Movable movable = new MovablePoint1(1, 2, 3, 4);
        System.out.println(movable);
        movable.moveLeft();
        System.out.println(movable);
        Movable movable1 = new MovableCircle(1,2,3,4,4);
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println(movable1);
    }
}
