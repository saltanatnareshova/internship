public class TestCylinder {
    public static void main(String[] args){
        Cylinder cylinder= new Cylinder();
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());

        Cylinder cylinder1= new Cylinder(10);
        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder1.getRadius());
        System.out.println(cylinder1.getArea());
        System.out.println(cylinder1.getVolume());

        Cylinder cylinder2= new Cylinder(10,5);
        System.out.println(cylinder2.getHeight());
        System.out.println(cylinder2.getRadius());
        System.out.println(cylinder2.getArea1());
        System.out.println(cylinder2.getVolume());
        System.out.println(cylinder2.toString());
    }
}
