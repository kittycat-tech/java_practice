import java.lang.Math;

public class Circle extends GeometricObject{

    private double radius;

    /** default constructor*/
    public Circle(){
        super();
    }

    /** Constructor with radius*/
    public Circle(double radius){
        this.radius = radius;
    }

    /** This getter method returns radius*/
    public double getRadius(){
        return radius;
    }

    /** This setter method sets the radius of the circle to the specified value*/
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return radius * radius *Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
}
