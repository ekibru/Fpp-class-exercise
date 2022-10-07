package In_Class_Demo.Inheritance;

public class TestEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        Manager boss = new Manager("John Smith",1200,2008,12,15);
        boss.setBonus(400);
        Employee [] employee = new Employee[3];
        employee[0]=boss;
        employee[1] = new Employee("Ephrem Kidu",4000,2012,3,12);
        employee[2] = new Manager("Susu Dada",2000,2018,3,15);

        double sum =0;
        for (int i = 0; i < employee.length; i++) {
            sum+=employee[i].getSalary();
            System.out.println("Name: "+employee[i].getName()+"\nSalary: "+
                    employee[i].getSalary()+"\nHire Date: "+employee[i].getHireDate());
        }
        System.out.println("Total Salary: "+ sum);
    }
}
