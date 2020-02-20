package hinh;
public class testCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(2,"blue");
        System.out.println(circle);
        System.out.println("dientich:"+circle.getArea());


        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(3,4,"black");
        System.out.println(cylinder);
        System.out.println("the tich:"+cylinder.getVolume());
    }
}
