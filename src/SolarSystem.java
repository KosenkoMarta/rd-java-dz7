public enum SolarSystem {
    MERCURY("Меркурій", 1, 0, 2439.7, null),
    VENUS("Венера", 2, 50.5, 6051.8, MERCURY),
    EARTH("Земля", 3, 40.4, 6371, VENUS),
    MARS("Марс", 4, 39.9, 3389.5, EARTH),
    JUPITER("Юпітер", 5, 45.5, 69911, MARS),
    SATURN("Сатурн", 6, 62.3, 58232, JUPITER),
    URANUS("Уран", 7, 25.7, 25362, SATURN),
    NEPTUNE("Нептун", 8, 15.6, 24622, URANUS);

    /*
     -порядковий номер від сонця
     -віддаленість від попередньої планети (для меркурія 0)
     -віддаленість від сонця
     -радіус
     -попередня планета
     -наступна планета
     */
    private final String name;
    private final int orderFromSun;
    private final Double distanceFromPrevious;
    private final Double distanceToSun;
    private final Double radius;
    private final SolarSystem previousPlanet;
    private SolarSystem nextPlanet;

    SolarSystem(String name, int orderFromSun, double distanceFromPrevious, double radius, SolarSystem previousPlanet) {
        this.name = name;
        this.orderFromSun = orderFromSun;
        this.distanceFromPrevious = distanceFromPrevious;
        this.distanceToSun = previousPlanet != null ? previousPlanet.distanceToSun + distanceFromPrevious : 20;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        if (previousPlanet != null) {
            previousPlanet.nextPlanet = this;
        }
        this.nextPlanet = null;
    }

    public String getName(){
        return name;
    }
    public Integer getOrderFromSun() {
        return orderFromSun;
    }
    public Double getDistanceFromPrevious() {
        return distanceFromPrevious;
    }
    public Double getDistanceToSun() {
        return distanceToSun;
    }
    public Double getRadius() {
        return radius;
    }
    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }
    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }

}
