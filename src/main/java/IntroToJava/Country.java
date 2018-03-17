package IntroToJava;

public class Country
{

    private double area;
    private String language;

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public void display()
    {
        System.out.println("The area is: " + area + " and the language is: " + language);
    }

    public Country()
    {
        area = 0;
        language = "unknown";
    }

    public Country(double area, String language)
    {
        this.area = area;
        this.language = language;
    }

}
