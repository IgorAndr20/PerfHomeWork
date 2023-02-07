package lesson43;

public class Task4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d;
        if (a < b) {
            if (b < c) {
                d = c;
            } else {
                d = b;
            }
        } else if (a < c) {
            d = c;
        } else {
            d = a;
        }
        if (a + b > c & a + c > b & b + c > a) {
            if (d * d > a * a + b * b) System.out.println("obtuse");
            else if (d * d == a * a + b * b) System.out.println("right");
            else System.out.println("acute");
        } else System.out.println("impossible");
    }

}
