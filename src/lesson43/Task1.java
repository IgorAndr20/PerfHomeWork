package lesson43;

public class Task1 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a < b) {
            if (b < c) System.out.println(c);
            else System.out.println(b);
        } else if (a < c) {
            System.out.println(c);

        } else System.out.println(a);
    }

}
