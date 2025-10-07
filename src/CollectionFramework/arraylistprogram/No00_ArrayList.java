package CollectionFramework.arraylistprogram;

import java.util.ArrayList;

public class No00_ArrayList {

    public static void main(String[] args) {
//        ArrayList a1= new ArrayList();
//        a1.add("Sidharth");
//        a1.add(29);



//        a1.add(5.5);
//        System.out.println(a1);     // not type safe


        ArrayList<String> khana= new ArrayList<String>();
        /// adding elements
        khana.add("Gulb jamun");
        khana.add("Pizza");
        khana.add(null);
        khana.add("Momo");
        khana.add("Paneer Role");
        khana.add(null);
        khana.add("puran poli");
        khana.add("palak");

        System.out.println(khana);
        // removing elements
        khana.remove("Pizza");
        System.out.println(khana);

        //fetching using index.

        System.out.println("fetching index "+khana.get(6));

        /// adding at peticular index
        khana.add(2,"kheer");
        System.out.println(khana);

        ///  updating an index value

        khana.set(khana.size()-1,"pulav");
        System.out.println(khana);

    }
}
