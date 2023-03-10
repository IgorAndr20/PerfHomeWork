package lesson58;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        if (args.length == 0) System.out.println("Нет аргументов");
        String str = Arrays.toString(args);
        if (str.matches(".*[A-ZА-Яа-я\\p{S}].*"))
            System.out.println("Ошибка");
        else {
            int len = 0;
            for (int i = 0; i < args.length; i++) {
                int temp = args[i].length();
                if (len < temp) len = temp;
            }
            for (int i = 0; i < args.length; i++) {
                if (args[i].length() == len) {
                    System.out.print(args[i] + " ");
                }
            }
        }
    }
}
