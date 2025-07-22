package Arrays.SingleDimensionalArrray;

public class ArrayLoopClockWise {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        int k=2,temp=0;
        System.out.println("ARRAY:{11,22,33,44,55}");

//        for (int i = 0; i <k+1; i++) {
//            System.out.println("PASS: "+i);
//            for (int j = 0; j <arr.length-1; j++) {
//                temp=arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//                for(int e : arr)
//                {
//                    System.out.print(+e+"|\t");
//                }
//                System.out.println("  ");
//            }
//        }

        //what sir told;
        for (int i = 0; i <k; i++) {
            int last=arr.length-1;
            for (int j =arr.length-1; j >0; j--) {
                arr[j]=arr[j-1];


            }
            arr[i]=arr[last];


        }

        System.out.println("\nOUTPUT:");
        for(int e : arr)
        {
            System.out.print(+e+"\t");
        }
    }
}
