public class test {

    public static void main(String[] args) {
        int[] arr=new int[]{10,7,22,9,2,1};
        int bigNumber=arr[0],temp;
        for (int i = 0; i<arr.length ; i++) {

           if (arr[i]>bigNumber)
           {

               bigNumber=arr[i];
           }
        }
        System.out.println(bigNumber);
    }
}