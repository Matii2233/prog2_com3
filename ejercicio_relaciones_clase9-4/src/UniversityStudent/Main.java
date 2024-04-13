package UniversityStudent;

public class Main {
    public static void main(String[] args) {
        University u1 = new University("UTN");
        Student s1 = new Student("Carlitos", u1);

        System.out.println();
        System.out.println(s1.getName()+" Asiste a la universidad '"+s1.getUniversity().getName()+"'");
    }
}