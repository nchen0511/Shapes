public class ETri extends Shape
{
    private int side;
    public ETri(int side)
    {
        super("equilateral triangle");
        this.side = side;


    }

    /**
     *
     * @return The area of the Triangle using formula (a^2 * sqrt (3))/2
     */
    public double getArea()
    {
        return(((side*side)* Math.sqrt(3))/4 );
    }

    /**
     * Multiply all 3 sides by 3
     * @return the Perimeter
     */

    public double getPerimeter()
    {
        return(side*3);
    }
}
