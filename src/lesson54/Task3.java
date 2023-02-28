package lesson54;

public class Task3 {
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
            }
            else if (sb.charAt(i) == '1') {
                sb.setCharAt(i, '0');
            }
        }
        System.out.println(sb);

    }
}
