package lesson54;

public class Task1 {
    public static String str = "Циклом называется многократное выполнение одних и тех же действий.";


    public static void main(String[] args) {
        String ch = args[0];
        String strcut = str.replaceAll("\\s","" );
        if (!strcut.contains(ch)) System.out.println("Символа нет в строке ");
        else System.out.println(strcut.indexOf(ch));
    }
}
