package lesson54;

public class Task4 {
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length();) {
            if (!Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
            }
            else i++;
        }
        System.out.println(sb);

    }
}
