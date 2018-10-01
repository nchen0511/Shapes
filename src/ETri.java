public class ETri extends shape
{
    private int side;
    public ETri(int side)
    {
        super("ETri");
        this.side = side;


    }

    public double getArea()
    {
        return((side*side)/2);
    }
    public double getPerimeter()
    {
        return(side*3);
    }
}
