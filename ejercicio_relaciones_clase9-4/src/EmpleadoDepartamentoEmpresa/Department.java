package EmpleadoDepartamentoEmpresa;
import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name, Employee employees) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.employees.add(employees);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Employee employee) {
        employees.add(employee);
    }
}
