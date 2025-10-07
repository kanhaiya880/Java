package CollectionFramework.arraylistprogram;

import java.util.*;

public class No3RemovingDuplicates {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("A","B","C","D","A","B"));
        Set<String> set=new LinkedHashSet<>(list);
        List<String> uniquelist=new ArrayList<>(set);
        System.out.println(uniquelist);
    }
}
