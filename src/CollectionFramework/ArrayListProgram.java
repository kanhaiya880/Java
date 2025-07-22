package CollectionFramework;
/// dublicates allowed ,
/// method's add,remove
import java.io.Serializable;
import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList l= new ArrayList();
        l.add("A");
        l.add(10);
        l.add(null);
        l.add("A");
        System.out.println(l);
        l.remove(2);
        l.add(0,"m");
        System.out.println(l);


    }
}
