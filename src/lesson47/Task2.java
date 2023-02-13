package lesson47;

public class Task2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        if (n <= 0 | m <= 0) System.out.println("Выходной!");
        else {
            int time = m * 60;
            int difTime = m * 60 + ((n - 1) * 10);
            int allTime = 0;
            for (int amount = 1; amount <= n; amount++) {
                allTime = ((time + difTime) / 2) * amount;
            }
            int hour = allTime / 60;
            int min = allTime - hour * 60;
            System.out.println("Бригада работала " + hour + " часов " + min + " минут");

        }
    }
}

//


