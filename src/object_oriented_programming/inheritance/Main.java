package object_oriented_programming.inheritance;

public class Main {
    public static void main(String[] args) {
        Cloth c1=new Cloth(1,"pant",400,"M");
        c1.ProductDetails();
        Electronic e1=new Electronic(1,"mobile",15000,1);
        e1.ProductDetails();
        //*********************************************************************************
        ContractEmployee ce1=new ContractEmployee("rohan",10000,3000);
        PermanentEmployee pe1=new PermanentEmployee("rajesh",100000);
        ce1.employeeDetails();
        pe1.employeeDetails();

    }
}
