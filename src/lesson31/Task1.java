package lesson31;

public class Task1 {
    private static int a = 4;
    private static int b = 5;

    public static void main(String[] args) {
        System.out.println("a = " + a + ", " + "b = " + b);
        a = b;
        int c = 4;
        int b = c;
        System.out.println("a = " + a + ", " + "b = " + b);


    }

}
