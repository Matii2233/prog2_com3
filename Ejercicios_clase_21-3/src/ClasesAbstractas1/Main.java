package ClasesAbstractas1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args){
        FullTimeEmployee e1 = new FullTimeEmployee(1, "Matias", 1500, 700);
        System.out.println("el salario del empleado "+e1.getName()+" es "+e1.calculateSalary());

        FullTimeEmployee e2 = new FullTimeEmployee(2, "Juan", 2000, 750);
        System.out.println("el salario del empleado "+e2.getName()+" es "+e2.calculateSalary());
    }
}
