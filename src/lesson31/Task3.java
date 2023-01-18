package lesson31;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("a = " + args[0] + ", b = " + args[1]);
        int a = Integer.parseInt (args[0]);
        int b = Integer.parseInt (args[1]);
        System.out.println((a % b) == 0);
    }
}
