public class Square extends Shape{
    private int side;

    public Square(int side){
        super("square");
        this.side = side;
    }

    public double getArea(){
        return Math.pow(this.side,2);
    }

    public double getPerimeter(){
        return (4*this.side);
    }
}
