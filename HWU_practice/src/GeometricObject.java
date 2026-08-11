public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** This constructs a default geometric object */
    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }

    /**This constructs a geometric object with color and filled value  */
    protected GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** This getter will retun the color */
    public String getColor(){
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Should return the boolean filled. Since it is a boolean, the get method is named as isFilled */
    public boolean isFilled(){
        return filled;
    }

    /** Now for the setter method of Filled, let's set a new filled*/
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\nColor: " + color
                + " and filled: " + filled;
    }

    /** This is the Abstract method getArea*/
    public abstract double getArea();

    /** Abstract method getPerimeter*/
    public abstract double getPerimeter();







}






