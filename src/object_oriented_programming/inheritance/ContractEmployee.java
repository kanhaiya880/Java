package object_oriented_programming.inheritance;

public class ContractEmployee extends Employee{
    int allowance;

    ContractEmployee(String name,double salary,int allowance)
    {
        this.name=name;
        this.salary=salary;
        this.allowance=allowance;
    }
    void employeeDetails()
    {
        salary=salary+allowance;
        System.out.println("\n***************************************************************");
        System.out.printf("\nName:%s\nSalary:%.2f",name,salary);
    }
}
