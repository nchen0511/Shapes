public class RegularTriangle extends Shape{


    private int base;
    private int base2;
    private int base3;
    public RegularTriangle(int base, int base2, int base3)
    {
        super("Regular Triangle");

        this.base = base;
        this.base2 = base2;
        this.base3 = base3;


    }

    public double getArea()
    {
        double p = (base+base2+base3)/2;
        return(Math.sqrt(p*(p-base)*(p-base2)*(p-base3)));
    }
    public double getPerimeter()
    {
        return(base + base2 + base3);
    }
}
