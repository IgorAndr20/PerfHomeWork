package lesson43;

public class Task2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        switch (a){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Восерсенье");
                break;
            default:
                System.out.println("Число вне диапазона!");
                break;
        }
    }
}
