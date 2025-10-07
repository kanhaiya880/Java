package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(30));
        System.out.println("arrayList = " + arrayList);

    }
}
