package lesson31;

public class Task2 {
    private static int a = 4;
    private static int b = 5;

    public static void main(String[] args) {
        System.out.println("a = " + a + ", " + "b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", " + "b = " + b);

    }
}
