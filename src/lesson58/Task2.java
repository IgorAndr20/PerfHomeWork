package lesson58;

import java.util.Arrays;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Нет аргументов");
            return;
        }

        Arrays.sort(args, Comparator.comparingInt(String::length).reversed());
        int maxlen = args[0].length();
        String result = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].matches("^[a-z0-9]+$")) {
                if (args[i].length() == maxlen) result += args[i] + " ";
            } else {
                System.out.println("Ошибка!");
                return;
            }
        }
        System.out.println(result);


    }
}



