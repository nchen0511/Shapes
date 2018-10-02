public class RegularTriangle extends Shape{


    private int base;
    private int base2;
    private int base3;
    public RegularTriangle(int base, int base2, int base3)
    {
        super("regular triangle");

        this.base = base;
        this.base2 = base2;
        this.base3 = base3;


    }

    /**
     * Uses a formula to calculate the area of triangle using 3 sides
     * sqrt of (p*(p-a)*(p-b)*(p-c))
     *
     * @return The area of Regular Triangle
     */
    public double getArea()
    {
        double p = (base+base2+base3)/2.0;
        return(Math.sqrt(p*(p-base)*(p-base2)*(p-base3)));
    }

    /**
     * Adds the three sides of the Triangle to get the perimeter.
     * @return The Perimeter
     */
    public double getPerimeter()
    {
        return(base + base2 + base3);
    }
}
