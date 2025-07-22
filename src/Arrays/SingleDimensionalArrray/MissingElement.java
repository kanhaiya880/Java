package Arrays.SingleDimensionalArrray;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7};


        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i+1]-arr[i]!=1)
            {
                System.out.println("missing element:"+(arr[i]+1));
            }
        }

    }


}