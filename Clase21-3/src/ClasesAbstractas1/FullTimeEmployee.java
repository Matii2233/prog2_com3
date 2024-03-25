package ClasesAbstractas1;

public class FullTimeEmployee extends Employee{
    private float yearlyBonus;


    public FullTimeEmployee(int id, String name, float salary, float yearlyBonus) {
        super(id, name, salary);
        this.yearlyBonus = yearlyBonus;
    }


    public float getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(float yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public float calculateSalary(){
        return super.calculateSalary() + yearlyBonus;
    }
}
