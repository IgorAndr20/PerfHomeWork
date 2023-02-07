package lesson43;


public class Task3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a < 30000) {
            if (a % 400 == 0) {
                System.out.println("YES");
            } else if (a % 4 == 0 & a % 100 != 0) {
                System.out.println("YES");

            } else System.out.println("NO");

        } else System.out.println("error");
    }
}
