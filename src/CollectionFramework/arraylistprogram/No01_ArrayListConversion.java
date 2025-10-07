package CollectionFramework.arraylistprogram;

import java.util.*;

public class No01_ArrayListConversion {
    public static void main(String[] args) {
        String[] arr={"kanhaiya","akshay","john","Hrithik","siddharth"};
        ArrayList<String> actors=new ArrayList<String>(Arrays.asList(arr));
        System.out.println(actors);

        //method one to iterate
        for (int i = 0; i < actors.size(); i++) {
            System.out.println(actors.get(i));

        }

        System.out.println("**********************************************");

        // Method 2nd using Iterator

        Iterator<String> itr=actors.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.hasNext()+" "+itr.next());
        }

        System.out.println("*********************** ListIterator **********************************");
        // Method 3rd using ListIterator

        ListIterator<String> litr=actors.listIterator(actors.size());
        while (litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }

        System.out.println("*********************** ForEach **********************************");

        for (String act : actors)
        {
            System.out.println(act);
        }

        /// using forEach method
        System.out.println("*********************** ForEach short **********************************");
        actors.forEach(act-> System.out.println(act));

        /// isEmpty()
        System.out.println("*********************** isEmpty **********************************");
        ArrayList<String> Movies=new ArrayList<String>();
        System.out.println(Movies.isEmpty());

        System.out.println("*********************** Collections utility **********************************");

        Movies.add("Kantara");
        Movies.add("Pushpa");
        Movies.add("Jolly llb");
        Movies.add("Demon slayer");
        Movies.add("Mahavtar narshimha");
        Movies.add("Pushpa");
        Movies.add("kgf");
        Movies.add("DDLj");
        Movies.add("Omg");

        /// Collection Framework
        /// Collection Interface
        /// Collections Utility class

        Collections.sort(Movies);
        System.out.println(Movies);

        Collections.reverse(Movies);
        System.out.println(Movies);

        Collections.shuffle(Movies);
        System.out.println(Movies);

        System.out.println(Movies.contains("Omg"));
        System.out.println(Movies.contains("krish"));



    }
}
