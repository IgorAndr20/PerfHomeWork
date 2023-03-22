package lesson58;

import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class Task5 {
    private static int y;

    public static void main(String[] args) {
        y = new Random().nextInt(5) + 1;
        Task5 output = new Task5();
        int array[][] = new int[y][];
        output.createArray(array);
        output.sortArray(array);
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        for (int[] row : array) {
            sj.add(Arrays.toString(row));
        }
        String result = sj.toString();
        System.out.println(result.replaceAll("\\[", "").replaceAll("\\]", ""));
    }
    public void createArray(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            array[j] = new int[new Random().nextInt(7) + 1];
            for (int i = 0; i < array[j].length; i++) {
                int t = new Random().nextInt(19) - 9;
                array[j][i] = t;
            }
        }
    }
    public void sortArray(int[][] array) {
        int[] sums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sums[i] = sum;
        }
        for (int i = 0; i < sums.length - 1; i++) {
            for (int j = i + 1; j < sums.length; j++) {
                if (sums[i] < sums[j]) {
                    int tempSum = sums[i];
                    sums[i] = sums[j];
                    sums[j] = tempSum;
                    int[] tempArray = array[i];
                    array[i] = array[j];
                    array[j] = tempArray;
                }
            }
        }
    }
}
