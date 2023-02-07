package lesson43;

public class Task5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        if (a < 0 | b < 0 | c < 0 | d < 0) System.out.println("Отрицательное значение!!!");
        else {
            int price = a * 100 + b;
            int money = c * 100 + d;
            if (price > money) System.out.println("Почему тут так мало?");
            else {
                int change = money - price;
                int rub = change / 100;
                int kop = change - rub * 100;
                if (rub == 0 & kop == 0) {
                    System.out.println("Без сдачи");
                } else if (rub == 0) System.out.println("Сдача составит " + kop + " копеек");
                  else if (kop == 0) System.out.println("Сдача составит " + rub + " рублей");
                  else
                    System.out.println("Сдача составит " + rub + " рублей и " + kop + " копеек");
            }
        }
    }
}
