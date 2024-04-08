package Ejercicio8;

public abstract class Employee {
    private int age;
    private String name;
    private double salary;
    private boolean workCapacity;

    public Employee() {}

    public Employee(int age, String name, double salary, boolean workCapacity) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.workCapacity = workCapacity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isWorkCapacity() {
        return workCapacity;
    }

    public void setWorkCapacity(boolean workCapacity) {
        this.workCapacity = workCapacity;
    }
}
