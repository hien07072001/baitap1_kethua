package hinh;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }
    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }

    public double getVolume(){
        return height*2*Math.PI*super.getRadius();

    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'+super.toString();
    }

}
