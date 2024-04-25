package ej1;
import java.util.Set;
import java.util.LinkedHashSet;

public class Alumno extends Persona{
    private Set<Grupo> groups = new LinkedHashSet<>();
    public Alumno(int idn, String name) {
        super(idn, name);
    }

    public Set<Grupo> getGroups(){
        return groups;
    }
    public void addGroup(Grupo group){
        groups.add(group);
    }
}
