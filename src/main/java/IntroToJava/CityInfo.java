package IntroToJava;

public class CityInfo {

    public static void main(String[] args)
    {

        City lyon = new City();
        lyon.setCityName("Lyon");
        lyon.setArea(18.51);
        lyon.setLanguage("French");
        lyon.setPopulation(484344);
        lyon.display();

        City venice = new City(160.07, "Italian", 264557, "Venice");
        venice.display();

    }

}
