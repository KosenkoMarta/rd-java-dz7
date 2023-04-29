import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(SolarSystem.values()));

        System.out.println("Опис сонячної системи");
        System.out.println("======================");
        System.out.println("Планета " + SolarSystem.MERCURY.getName() + " № " + SolarSystem.MERCURY.getOrderFromSun());
        System.out.println("Віддаленість від попередньої планети = " + SolarSystem.MERCURY.getDistanceFromPrevious());
        System.out.println("Віддаленість від Сонця = " + SolarSystem.MERCURY.getDistanceToSun());
        System.out.println("Радіус цієї планети = " + SolarSystem.MERCURY.getRadius());
        System.out.println("Наступна планета - це " + SolarSystem.MERCURY.getNextPlanet() + "(англ.)");
        System.out.println("______________________");
        System.out.println("Планета " + SolarSystem.VENUS.getName() + " № " + SolarSystem.VENUS.getOrderFromSun());
        System.out.println("Віддаленість від попередньої планети = " + SolarSystem.VENUS.getDistanceFromPrevious());
        System.out.println("Віддаленість від Сонця = " + SolarSystem.VENUS.getDistanceToSun());
        System.out.println("Радіус цієї планети = " + SolarSystem.VENUS.getRadius());
        System.out.println("Попередня планета - це " + SolarSystem.VENUS.getPreviousPlanet() + "(англ.)");
        System.out.println("Наступна планета - це " + SolarSystem.EARTH.getNextPlanet() + "(англ.)");
        System.out.println("______________________");
        System.out.println("Планета " + SolarSystem.EARTH.getName() + " № " + SolarSystem.EARTH.getOrderFromSun());
        System.out.println("Віддаленість від попередньої планети = " + SolarSystem.EARTH.getDistanceFromPrevious());
        System.out.println("Віддаленість від Сонця = " + SolarSystem.EARTH.getDistanceToSun());
        System.out.println("Радіус цієї планети = " + SolarSystem.EARTH.getRadius());
        System.out.println("Попередня планета - це " + SolarSystem.EARTH.getPreviousPlanet() + "(англ.)");
        System.out.println("Наступна планета - це " + SolarSystem.MARS.getNextPlanet() + "(англ.)");
        System.out.println("______________________");
    }
}
