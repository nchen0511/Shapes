public class RegularTriangle extends Shape{
}
    private int height;
    private int base;
    private int base2;
    private int base3;
    public RegularTriangle(int height, int base)
    {
        super("Regular Triangle");
        this.height = height;
        this.base = base;

    }

    public double getArea()
    {
        return((base*height)/2);
    }
    public double getPerimeter()
    {
        return(base + base2 + base3);
    }
}
