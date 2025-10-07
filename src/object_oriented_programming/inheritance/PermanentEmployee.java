package object_oriented_programming.inheritance;

public class PermanentEmployee extends Employee {
    private double pf=6000;

    PermanentEmployee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }

    void employeeDetails()
    {
        salary=salary-pf;
        System.out.println("\n***************************************************************");
        System.out.printf("\nName:%s\nSalary:%.2f",name,salary);
    }
}
