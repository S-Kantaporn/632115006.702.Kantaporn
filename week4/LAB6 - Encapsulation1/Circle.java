//Name:Kantaporn Sriwichai
//632115006

package week4;

public class Circle {
    private double radius =1;
    public static int numberOfObjects = 0;
    String color;

    public Circle() {
        numberOfObjects++;
    }

    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }
    
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(int number) {
        numberOfObjects = number;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
