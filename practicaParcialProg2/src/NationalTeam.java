import java.util.Set;
import java.util.LinkedHashSet;

public class NationalTeam {
    private String color;
    private String country;
    private Set<Athlete> athletes;

    public NationalTeam() {
        this.athletes = new LinkedHashSet<>();
    }
    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
        this.athletes = new LinkedHashSet<>();
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}
    public Set<Athlete> getAthletes() {return athletes;}
    public void setAthlete(Athlete athlete) {
        this.athletes.add(athlete);
    }
}
