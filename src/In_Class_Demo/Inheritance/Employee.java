package In_Class_Demo.Inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

    // instance Field
    private String name;
    private double salary;
    private Date hireDate;

    public Employee() {
        this.name= null;
        this.salary=0.0;
        this.hireDate = null;

    }

    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar cal = new GregorianCalendar(year,month-1,day);
        this.hireDate = cal.getTime();
    }

    //INstance method
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MMMM-yyyy");

        return format.format(hireDate);
    }
}
