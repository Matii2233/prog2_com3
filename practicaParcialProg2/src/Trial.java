import java.util.Set;
import java.util.LinkedHashSet;

public class Trial {
    //Atributos
    private int code;
    private String tittle;
    private Set<Athlete> athletes;
    private Headquarters headquarters;


    //Constructores
    public Trial(Athlete athlete) {
        this.athletes = new LinkedHashSet<>();
        this.athletes.add(athlete);
    }
    public Trial(int code, String tittle, Athlete athlete) {
        this.code = code;
        this.tittle = tittle;
        this.athletes = new LinkedHashSet<>();
        this.athletes.add(athlete);
    }


    //Metodos
    public int getCode() {return code;}
    public void setCode(int code) {this.code = code;}
    public String getTittle() {return tittle;}
    public void setTittle(String tittle) {this.tittle = tittle;}
    public Set<Athlete> getAthletes() {return athletes;}
    public void setAthlete(Athlete athlete) {this.athletes.add(athlete);}
    public Headquarters getHeadquarters() {return headquarters;}
    public void setHeadquarters(Headquarters headquarters) {this.headquarters = headquarters;}
}
