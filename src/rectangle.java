public class rectangle extends shape{
    private int height;
    private int width;

    public rectangle(int height, int width){
        super("rectangle");
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return (2*this.height) + (2*this.width);
    }
}
