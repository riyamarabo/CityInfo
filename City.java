package IntroToJava;

public class City extends Country
{
    private String cityName;
    private double population;

    public City()
    {
        super();
        population = 0;
        cityName = "unknown";
    }

    public City(double area, String language, double population, String cityName)
    {
        super(area, language);
        this.population = population;
        this.cityName = cityName;
    }

    @Override
    public void display()
    {
        System.out.println(getCityName() + " has an area of:  "
                + getArea() + " square miles and a population of: "
                + getPopulation() + " that speaks the "
                + getLanguage() + " language" );
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

}
