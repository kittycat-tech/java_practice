public class Rectangle extends GeometricObject{
    private double width;
    private double height;

    /** This is the default constructor with super*/
    public Rectangle(){
        super();
    }
    /** Now this is our constructor with parameters*/
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** This getter method returns width */
    public double getWidth(){
        return width;
    }

    /** This getter method returns height */
    public double getHeight(){
        return height;
    }

    /** Let's do two setter methods for width and height */

    public void setWidth(double width){
        this.width= width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    /** Now let's completely define the override methods from the parent class */
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return 2*width*height;
    }
}
