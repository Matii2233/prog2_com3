package EmpleadoDepartamentoEmpresa;
import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company() {}

    public Company(String name, Department departments) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.departments.add(departments);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Department department) {
        this.departments.add(department);
    }
}
