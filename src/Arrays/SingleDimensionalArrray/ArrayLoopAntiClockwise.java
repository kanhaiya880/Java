package Arrays.SingleDimensionalArrray;

public class ArrayLoopAntiClockwise {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int k = 2, n = arr.length;
        k = k % n; // handle k > n

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[(i + k) % n];
        }

        System.out.println("OUTPUT:");
        for (int e : res)
            System.out.print(e + "\t");
    }
}
