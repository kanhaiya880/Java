package object_oriented_programming.polymorphism.overriding;

public class TestClass {

    public static void main(String[] args) {
        Hospital doc=new Doctor();
        doc.person("Dr.Hathi",47,"Gokul Dham");
        Hospital pat=new Patient();
        pat.person("sumit",22,"Pune");
        Hospital visitor=new Visitor();
        visitor.person("kanhaiya",22,"Parbhani");
    }
}
