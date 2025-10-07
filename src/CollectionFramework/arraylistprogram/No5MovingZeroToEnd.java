package CollectionFramework.arraylistprogram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No5MovingZeroToEnd {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(Arrays.asList(0,0,1,2,0,3,6,7));
        List<Integer> result=new ArrayList<>();
        int count=0;
        for(int num:l1)
        {
            if (num!=0)
            {
                result.add(num);
            }
            else
            {
                count++;
            }
        }
        for (int i=0;i<count;i++)
        {
            result.add(0);
        }
        System.out.println(result);
    }
}
