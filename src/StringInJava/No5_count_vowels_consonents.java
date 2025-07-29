package StringInJava;
//write  a code to count the number of vowels an consonents
//in a given word
/// sample input =success
/// //output=vowels:2
/// consonents:5
public class No5_count_vowels_consonents {

    public static void main(String[] args) {
        String str="Success";
        String v="aeiouAEIOU";
        int vcount=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <v.length(); j++) {
                if (str.charAt(i)==v.charAt(j))
                {
                    vcount++;
                }
            }
        }
        System.out.println("vowels "+vcount);
        System.out.println("consonant:"+(str.length()-vcount));
    }
}
