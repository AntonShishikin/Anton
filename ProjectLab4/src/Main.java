public class Main {
    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favoriteSeason);

        describeSeason(favoriteSeason);

        for (Season season : Season.values()) {
            System.out.println(season + ", средняя температура: " + season.getAverageTemperature() + ", " + season.getDescription());
        }
    }

    public static void describeSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
