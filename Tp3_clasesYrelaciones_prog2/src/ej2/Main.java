package ej2;

public class Main {
    public static void main(String[] args) {
        Employee claudia = new Employee("Claudia Salinas");
        Employee arturo = new Employee("Arturo Mercado");

        //arturo.addSupervisor(claudia);
        System.out.println();

        System.out.println("La primer empleada se llama " +claudia.getName());
        System.out.println("El empleado " +arturo.getName()+ " tiene de supervisora a " +arturo.getSupervisorName());
    }
}
