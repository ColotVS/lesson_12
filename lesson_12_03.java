public class lesson_12_03 {
    //Программа выводит на экран основные факты о Солнечной системе.
    //Перепиши код так, чтобы в выводе использовались все переменные класса SolarSystem,
    //но результат работы программы при этом не изменился.
    public static void main(String[] args) {
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + SolarSystem.age + " лет.");
        System.out.println("В Солнечной системе " + SolarSystem.planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из "+ SolarSystem.starsCount+" звезды.");
        System.out.println("Звезды по имени "+SolarSystem.starName+".");
        System.out.println("Расстояние к центру галактики составляет " + SolarSystem.galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}

class SolarSystem {

    public static long age = 4_568_200_000L;

    public static int planetsCount = 8;

    public static int starsCount = 1;

    public static String starName = "Солнце";

    public static int galacticCenterDistance = 27170;


}
