package ej1;
import java.util.Set;
import java.util.LinkedHashSet;


public class Grupo {
    private String course;
    private char letter;
    private Alumno students[] = new Alumno[5];
    private Set<Asignatura> asignatures = new LinkedHashSet<>();


    public Grupo(String course, char letter, Alumno student) {
        this.course = course;
        this.letter = letter;
        this.students[0] = student;
    }


    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public char getletter() {
        return letter;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Alumno[] getStudents(){
        return students;
    }
    public void addStudent(int position, Alumno student) {
        if(position>-1 && position<5){
            if (students[position] == null){
                students[position] = student;
            }
        }
    }

    public Set<Asignatura> getAsignatures(){
        return asignatures;
    }
    public void addAsignature(Asignatura asignature) {
        asignatures.add(asignature);
    }
}
