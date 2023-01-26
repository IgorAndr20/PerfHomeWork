package lesson39;

public class SummaMain {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        double x = 3.0;
        double y = 4.0;
        double z = 2.5;
        System.out.println(Summa.sum(a, b));
        System.out.println(Summa.sum(x, y, z));
        System.out.println(Summa.sum(x, y));
        System.out.println(Summa.sum(x, y, z));
        System.out.println(Summa.sum(a, x, y));
        System.out.println(Summa.sum(x, y));

    }
}
