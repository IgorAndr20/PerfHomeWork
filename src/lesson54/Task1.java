package lesson54;

public class Task1 {
    public static String str = "Циклом называется многократное выполнение одних и тех же действий.";


    public static void main(String[] args) {
        String ch = args[0];
        String strcut = str.replaceAll("\\s","" );
        System.out.println(strcut.indexOf(ch));
    }
}
