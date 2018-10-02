public class Rectangle extends Shape{
    private int height;
    private int width;


    public Rectangle(int height, int width){
        super("rectangle");
        this.height = height;
        this.width = width;
    }

    /**
     * Area formula for rectangle
     * length x width
     *
     * @return
     */
    public double getArea(){
        return this.height*this.width;
    }

    /**
     * Perimeter formula for rectangle
     * (2 x length) + (2 x width)
     *
     * @return
     */
    public double getPerimeter(){
        return (2*this.height) + (2*this.width);
    }
}
