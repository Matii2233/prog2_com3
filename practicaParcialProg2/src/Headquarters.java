import java.util.Set;
import java.util.LinkedHashSet;

public class Headquarters {
    //Atributos
    private int fase;
    private String date;
    private String hour;
    private Set<Instalation> instalations;
    private Set<Trial> trials;


    //Constructores
    public Headquarters (Instalation instalation) {
        this.instalations = new LinkedHashSet<>();
        this.instalations.add(instalation);
        this.trials = new LinkedHashSet<>();
    }
    public Headquarters(int fase, String date, String hour, Instalation instalation, Trial trial) {
        this.fase = fase;
        this.date = date;
        this.hour = hour;
        this.instalations = new LinkedHashSet<>();
        this.instalations.add(instalation);
        this.trials = new LinkedHashSet<>();
        this.trials.add(trial);
    }


    //Metodos
    public int getFase() {return fase;}
    public void setFase(int fase) {this.fase = fase;}
    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}
    public String getHour() {return hour;}
    public void setHour(String hour) {this.hour = hour;}
    public Set<Instalation> getInstalations() {return instalations;}
    public void setInstalations(Instalation instalation) {this.instalations.add(instalation);}
    public Set<Trial> getTrials() {return trials;}
    public void setTrials(Trial trial) {this.trials.add(trial);}
}
