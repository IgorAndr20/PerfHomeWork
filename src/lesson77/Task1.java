package lesson77;

import java.util.Arrays;
import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Нет аргументов");
        }
        HashSet<String> unique = new HashSet<>();
        for (String i : args) {
            unique.add(i);
        }
        String str = Arrays.toString(args);
        String str2 = unique.toString();
        System.out.println(str.substring(1, str.length() - 1));
        System.out.println(str2.substring(1, str2.length() - 1));
    }
}

