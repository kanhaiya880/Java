package CollectionFramework.arraylistprogram;

import java.util.*;

public class No2RotateListByKPositions {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int k=2;
        int n=l1.size();
        k=k%n;
        System.out.println(k);
        List<Integer> rotated=new ArrayList<>();
        for (int i = n-k; i <n ; i++) {
            rotated.add(l1.get(i));

        }
        for (int i=0;i<=n-k;i++)
        {
            rotated.add(l1.get(i));
        }


        System.out.println(rotated);
    }
}
