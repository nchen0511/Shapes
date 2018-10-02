public class Runner {
    public static void main(String[] args){
        Shape shape1 = new Rectangle(100,5);
        Shape shape2 = new Circle(500);
        Shape shape3 = new ETri(123);
        Shape shape4 = new Square(20);


        System.out.println(shape1);
        System.out.println("My area is " + shape1.getArea());
        System.out.println("My perimeter is " + shape1.getPerimeter());

        System.out.println();

        System.out.println(shape2);
        System.out.println("My area is " + shape2.getArea());
        System.out.println("My circumference is " + shape2.getPerimeter());

        System.out.println();

        System.out.println(shape3);
        System.out.println("My area is " + shape3.getArea());
        System.out.println("My perimeter is " + shape3.getPerimeter());

        System.out.println();

        System.out.println(shape4);
        System.out.println("My area is " + shape4.getArea());
        System.out.println("My perimeter is " + shape4.getPerimeter());
    }
}
