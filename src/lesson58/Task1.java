package lesson58;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

    public void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int x = new Random().nextInt(19) - 9;
            a[i] = x;
        }
    }

    public static void main(String[] args) {
        Task1 array = new Task1();
        int[] a = new int[20];
        array.fillArray(a);
        String str = Arrays.toString(a);
        System.out.println(str.substring(str.indexOf('[') + 1, str.lastIndexOf(']')));

    }
}