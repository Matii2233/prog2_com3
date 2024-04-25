package ej1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedHashSet;

public class Profesor extends Persona{
    private String department;
    private Set<Asignatura> asignatures = new LinkedHashSet<>();


    public Profesor(int idn, String name) {
        super(idn, name);
    }
    public Profesor(int idn, String name, String department, Asignatura asignature) {
        super(idn, name);
        this.department = department;
        this.asignatures.add(asignature);
    }


    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    public void addAsignature(Asignatura asignature) {
        asignatures.add(asignature);
    }
    public Set<Asignatura> getAsignaturas() {
        return asignatures;
    }
    public Set<Asignatura> getAsignatura() {
        return asignatures;
    }


    public void removeAsignature(Asignatura asignature) {
        asignatures.remove(asignature);
    }
}
