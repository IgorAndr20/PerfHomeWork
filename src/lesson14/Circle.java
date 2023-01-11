package lesson14;

public class Circle {
     private int radius;
     private final double PI = 3.14d;
     public void calcArea() {
        System.out.print(PI*radius*radius + (" - "));
    }
    public void calcLenght() {
        System.out.println(2*PI*radius);
    }
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.radius = 4;
        System.out.print(circle1.radius + " - ");
        circle1.calcArea();
        circle1.calcLenght();

        Circle circle2 = new Circle();
        circle2.radius = 7;
        System.out.print(circle2.radius + " - ");
        circle2.calcArea();
        circle2.calcLenght();

        Circle circle3 = new Circle();
        circle3.radius = 9;
        System.out.print(circle3.radius + " - ");
        circle3.calcArea();
        circle3.calcLenght();
    }
}
