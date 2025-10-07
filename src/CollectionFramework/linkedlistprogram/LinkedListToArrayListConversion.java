package CollectionFramework.linkedlistprogram;
import java.util.*;
public class LinkedListToArrayListConversion {
    public static void main(String[] args) {
        ArrayList<String> arrli=new ArrayList<String>();
        arrli.add("Golden retriever");
        arrli.add("Beagul");
        arrli.add("Husky");
        arrli.add("German Shepard");
        arrli.add("Apso");
        arrli.add("French bull");
        arrli.add("Dobberman");
        arrli.add("Great den");

        LinkedList<String> dogs=new LinkedList<String>(arrli);

//		for(int i=0;i<arrli.size();i++)
//		{
//			dogs.add(arrli.get(i));
//		}

        System.out.println(dogs);
    }
}
