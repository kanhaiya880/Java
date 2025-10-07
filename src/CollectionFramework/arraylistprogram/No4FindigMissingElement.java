package CollectionFramework.arraylistprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No4FindigMissingElement {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(Arrays.asList(1,2,4,5,7));
        for (int i = 0; i < l1.size()-1; i++)
        {

            if ((l1.get(i+1)-l1.get(i))!=1)
            {
                System.out.println(l1.get(i)+1);
            }
        }
    }
}
