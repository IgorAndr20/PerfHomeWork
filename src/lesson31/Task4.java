package lesson31;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("P = " + args[0] + ", r = " + args[1] + ", t = " + args[2]);
        double P = Integer.parseInt (args[0]);
        double r = (Double.parseDouble(args[1])) / 100;
        double t = Integer.parseInt (args[2]);
        double e = Math.exp(r * t);
        System.out.println((P*e));
    }
}
