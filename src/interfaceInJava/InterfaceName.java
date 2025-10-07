package interfaceInJava;

public interface InterfaceName {
    // Constant (public,static,final by default)
    int VALUE=100;
    //abstract method (public and abastract by default)
    void show();
    //Since java 8, we can also hava:
    default  void  defaultMethod(){
        System.out.println("This is a default method");
    }
    static void staticMehthod()
    {
        System.out.println("This is a static method");
    }
}
