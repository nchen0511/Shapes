public class Runner {
    public static void main(String[] args){
        /**
         * The array, Shape contains the shapes Rectangle, Circle, E(quilateral) Triangle, Square and Ellipse. Their respective parameters are listed to their right
         */
        Shape[] shapes = {new Rectangle(100,5),new Circle(500),new ETri(123),new Square(20),new Ellipse(4,6)};


        /**
         * The For-Each loop repeats for each object inside the array Shape. It uses cur as an index to move along the array.
         */
        for(Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is " + cur.getArea());
            System.out.println("My perimeter is " + cur.getPerimeter());
            System.out.println();
        }
    }
}