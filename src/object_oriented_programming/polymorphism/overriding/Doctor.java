package object_oriented_programming.polymorphism.overriding;

public class Doctor extends Hospital{
    String spec="Ortho";
    public void person(String name,int age,String address)
    {
        System.out.printf("\nName: %s\nAge:%d\nAdderss:%s\nDoctor Specification:%s",name,age,address,spec);
    }

//    public static void main(String[] args)
//    {
//        Hospital doc= new Doctor(); //dynamic binding
//        doc.person("Dr.Hathi",45,"Gokuldham society");
//        Hospital visitor =new Hospital();
//        visitor.person("sidharth",29,"sikkim");
//    }
}
