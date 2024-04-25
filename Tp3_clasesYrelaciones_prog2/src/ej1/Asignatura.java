package ej1;
import java.util.Set;
import java.util.LinkedHashSet;

public class Asignatura {
    private String name;
    private int classroom;
    private String hour;
    private Profesor profesor;
    private Set<Grupo> groups = new LinkedHashSet<>();



    public Asignatura(String nombre, int classroom, String hour) {
        this.name = nombre;
        this.classroom = classroom;
        this.hour = hour;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getHour() {
        return hour;
    }
    public void setHour(String hour) {
        this.hour = hour;
    }

    public void addProfesor(Profesor profesor){
        this.profesor = profesor;
    }
    public Profesor getProfesor() {return profesor;}

    public Set<Grupo> getGroups(){
        return groups;
    }
    public void addGroup(Grupo group) {
        groups.add(group);
    }



    public void removeProfesor(){
        this.profesor = null;
    }
    public void removeGroup(Grupo group){
        for (Grupo g : groups) {
            if (g == group) {
                groups.remove(g);
            } else {
                System.out.println("Grupo no encontrado");
            }
        }
    }
}
