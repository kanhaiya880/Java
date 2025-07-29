package CollectionFramework.arraylistprogram;
import java.util.ArrayList;
public class No1_example {

    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        //see return type of add below
        System.out.println(al.add("ddd"));
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al);
        al.remove(0);
        al.remove("ddd");
        System.out.println("using for each");
        for(String i : al)
        {
            System.out.println(i);
        }
        System.out.println("using for loop");
        for (int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
}
