package EmpleadoDepartamentoEmpresa;

public class Main {
    public static void main(String[] args) {
        // Creacion de los objetos empleados, luego departamentos y luego la empresa
        Employee e1 = new Employee("Supervisor Mañana", "Ezequiel Barrios");
        Employee e2 = new Employee("Diseñadora Publicitaria", "Agustina Meza");
        Employee e3 = new Employee("Editor de video", "Luciano Mancilla");
        Employee e4 = new Employee("Encargado del control de calidad del perfume", "Daniel Ortiz");

        Department d1 = new Department("Publicidad", e1);
        Department d2 = new Department("Revision de seguridad y salud", e4);

        Company c1 = new Company("HyG", d1);

        // mas empleados al departamento d1
        d1.setEmployees(e2);
        d1.setEmployees(e3);

        // otro departamento a la empresa c1
        c1.setDepartments(d2);



        // cargos de los empleados
        System.out.println();
        System.out.println("Cargos de los empleados");
        System.out.println(" -"+e1.getName()+", de "+ d1.getName()+ ": "+ e1.getPosition());
        System.out.println(" -"+e2.getName()+", de "+ d1.getName()+ ": "+ e2.getPosition());
        System.out.println(" -"+e3.getName()+", de "+ d1.getName()+ ": "+ e3.getPosition());
        System.out.println(" -"+e4.getName()+", de "+ d2.getName()+ ": "+ e4.getPosition());
        System.out.println();

        // Bucles para acceder a los arraylist de los objetos y obtener los nombres de las clases
        // de los arraylists

        // Empleados del departamento1
        System.out.println("Los empleados del departamento 1 son:");
        for(Employee employees : d1.getEmployees()){
            System.out.println(" -"+ employees.getName());
        }
        System.out.println();

        // empleados del departamento 2
        System.out.println("Los empleados del departamento 2 son:");
        for(Employee employees : d2.getEmployees()){
            System.out.println(" -"+ employees.getName());
        }
        System.out.println();


        // departamentos de la empresa 1
        System.out.println("Los departamentos de la empresa "+ c1.getName()+ " son:");
        for(Department departments : c1.getDepartments()){
            System.out.println(" -"+ departments.getName());
        }
        System.out.println();


        // empleados de los departamentos de la empresa 1
        System.out.println("Los empleados de la empresa "+c1.getName()+" son:");
        for(Department departments : c1.getDepartments()) {
            for(Employee employee : departments.getEmployees()){
                System.out.println(" -"+ employee.getName());
            }
        }
    }
}
