public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25),
    AUTUMN(15);

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return this == SUMMER ? "Теплое время года" : "Холодное время года";
    }
}
