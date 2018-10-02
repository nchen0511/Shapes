public abstract class Shape {
    private String type;

    /**
     * Type refers to the shape "type"
     * @param type
     */
    public Shape(String type){
        /**
         * This constructor assigns the name of the shape to the shape
         */
        this.type = type;
    }

    /**
     * These return the area and the perimeters and print them out
     * @return
     */
    public abstract double getArea();
    public abstract double getPerimeter();

    /**
     * This method changes the toString method so it actually prints out as I am a 'insert shape type here' .
     * @return
     */
    public String toString(){
        return "I am a " + type + ".";
    }
}