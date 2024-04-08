package Ejercicio8;

public class Manager extends Employee{
    private String department;

    public Manager() {}
    public Manager(int age, String name, double salary, boolean workCapacity, String department) {
        super(age, name, salary, workCapacity);
        this.department = department;
    }

    public String getDepartment() {return department;}

    public void setDepartment(String department) {this.department = department;}

    public String dictateNewActivities() {
        System.out.println("Se deben producir mas muñecos de super man");
        return "muñeco de superman";
    }

    public void showInfo(){
        System.out.println("La edad del gerente es "+this.getAge());
        System.out.println("El nombre del gerente es "+this.getName());
        System.out.println("El salario del gerente es "+this.getSalary());
        if (this.isWorkCapacity()){
            System.out.println("La capacidad laboral del gerente es buena");
        } else {
            System.out.println("La capacidad laboral del gerente no esta en condiciones");
        }
        System.out.println("El departamento del gerente es "+this.getDepartment());
    }
}
