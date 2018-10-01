public class runner {
    public static void main(String[] args){
        shape shape1 = new rectangle(100,5);
        shape shape2 = new circle(500);


        System.out.println(shape1);
        System.out.println("My area is " + shape1.getArea());
        System.out.println("My perimeter is " + shape1.getPerimeter());

        System.out.println();

        System.out.println(shape2);
        System.out.println("My area is " + shape2.getArea());
        System.out.println("My circumference is " + shape2.getPerimeter());
    }
}
