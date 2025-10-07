package object_oriented_programming.polymorphism.overriding;

public class Patient extends Hospital{
    String issue="";
    public void person(String name,int age,String address)
    {
        System.out.printf("\nName: %s\nAge:%d\nAdderss:%s\nIssue:%s",name,age,address,issue);
    }
}
