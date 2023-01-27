package lesson39;


public class Animal {
    public static String planet = "Земля";

    public static void testStaticMethod() {
        System.out.println("Это статическое животное");
    }
    public static String getPlanet() {
        return planet;
    }
}

