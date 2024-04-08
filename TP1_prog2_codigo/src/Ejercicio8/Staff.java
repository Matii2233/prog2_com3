package Ejercicio8;

public class Staff extends Employee{
    private String department;

    public Staff() {}
    public Staff(int age, String name, double salary, boolean workCapacity, String department) {
        super(age, name, salary, workCapacity);
        this.department = department;
    }

    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}

    public void toProduce(String object){
        System.out.println("Produccion de "+object);
        for (int i=0; i<10; i++) {
            if (i==9){
                System.out.println(object);
            } else {
                System.out.println(object+", ");
            }
        }
    }

    public void showInfo(){
        System.out.println("La edad del/la trabajador/ra es "+this.getAge());
        System.out.println("El nombre del/la trabajador/ra es "+this.getName());
        System.out.println("El salario del/la trabajador/ra es "+this.getSalary());
        if (this.isWorkCapacity()){
            System.out.println("La capacidad laboral del/la trabajador/ra es buena");
        } else {
            System.out.println("La capacidad laboral del/la trabajador/ra no esta en condiciones");
        }
        System.out.println("El departamento del/la trabajador/ra es "+this.getDepartment());
    }
}
