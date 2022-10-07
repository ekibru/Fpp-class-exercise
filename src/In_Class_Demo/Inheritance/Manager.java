package In_Class_Demo.Inheritance;

public class Manager extends Employee{
private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }
}
