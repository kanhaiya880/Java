package StringInJava;

class No12_find_smallest_and_largest_word_in_sentence {
    public static void main(String[] args) {
        String s1 = "kanhaiya chaudhari";
        String large = "", small = "";

        String[] s1arr = s1.split(" ");

        // Initialize small and large with the first word
        small = large = s1arr[0];

        for (int i = 1; i < s1arr.length; i++) {
            if (s1arr[i].length() > large.length()) {
                large = s1arr[i];
            }
            if (s1arr[i].length() < small.length()) {
                small = s1arr[i];
            }
        }

        System.out.printf("Smallest: %s, Largest: %s", small, large);
    }
}
