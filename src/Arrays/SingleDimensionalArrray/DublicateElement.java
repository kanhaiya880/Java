package Arrays.SingleDimensionalArrray;

public class DublicateElement {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,1,2,4,4,5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                {
                    System.out.println("Dublicate element :"+arr[j]);
                }
            }

        }
    }
}
