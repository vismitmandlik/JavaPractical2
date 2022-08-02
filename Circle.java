import java.util.*;
public class Circle {
    double radius=1;
        Circle(){
                System.out.println("Default Circle.");
        }
        Circle(double r){
            radius=r;
            System.out.println("Circle with radius "+radius+".");
        }
        public void getArea(){
            double area = (3.14 * radius * radius);
            System.out.println("Area of Circle is : "+area);
        }
        public void getPerimeter(){
            double perimeter = (3.14 * 2 * radius);
            System.out.println("Perimeter of Circle is : "+perimeter);
        }
    public static void main(String args[]){
        Circle c = new Circle();
        Circle c1 = new Circle(5);
        c.getArea();
        c.getPerimeter();

    }
    
}
