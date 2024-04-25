package ej2;

public class Employee {
    private String name;
    private Employee supervisor;


    public Employee(String name) {
        this.name = name;
    }


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Employee getSupervisor() {return supervisor;}
    public void addSupervisor(Employee supervisor) {this.supervisor = supervisor;}

    public String getSupervisorName(){
        if (supervisor != null) {
            return supervisor.getName();
        } else {
            return "'SIN SUPERVISOR'";
        }
    }
}
