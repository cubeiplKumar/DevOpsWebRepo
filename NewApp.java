class Circle
{
    double radius;
    
    void calculateArea() //method 1 definition
    {
        double area = 3.14*radius*radius;
        System.out.println("Area of circle: " +area);
    }
    void calculateCircumference() //method 2 definition
    {
        double circum = 2*3.14*radius;
        System.out.println("Circumference of circle: " +circum);
    }
}
#feature2.2 changes by vinay
public class RectangleAreaCalculator {

    // User-defined method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        // Example of using the method
        double length = 5.0;
        double width = 3.0;

        // Calling the method
        double result = calculateRectangleArea(length, width);

        // Displaying the result
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + result);
    }
}
// Constructor to initialize the instance variables
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method to bark
    public void bark() {
        System.out.println(name + " says Woof!");
    }
#end of feature2.2
class Main
{
    public static void main(String args[])
    {
        Circle c = new Circle(); //creating object of class circle
        c.radius = 5; 
        c.calculateArea(); //invokes calculateArea() with object c
        c.calculateCircumference(); //invokes calculateCircumference() with object c
    }
}