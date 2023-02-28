package lesson54;

public class Task2 {
    public static void main(String[] args) {
        String path = args[0];
        if (path.endsWith("\"") | path.endsWith("/")) {
            System.out.println("Введен некорректный путь до файла.");
        } else {
            if (path.contains("" + "\\")) {
                int separatorIndex = path.lastIndexOf("\\");
                String fileName = path.substring(separatorIndex + 1);
                String pathName = path.substring(0, separatorIndex + 1);
                System.out.println("Путь: " + pathName);
                System.out.println("Имя файла: " + fileName);
            } else {
                int separatorIndex = path.lastIndexOf("/");
                String fileName = path.substring(separatorIndex + 1);
                String pathName = path.substring(0, separatorIndex + 1);
                System.out.println("Путь: " + pathName);
                System.out.println("Имя файла: " + fileName);
            }
        }
    }


}

