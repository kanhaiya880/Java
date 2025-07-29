package StringInJava;

public class No5_count_words_in_sentence {
    public static void main(String[] args) {
        String str="have a great day all and enjoy well";
        String v="aeiouAEIOU";
        int SpaceCount=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int num=(int)ch;
            if (num == 32)
            {
             SpaceCount++;
            }

        }

        System.out.println("space count:"+SpaceCount);
        System.out.println("word count: "+(SpaceCount+1));

    }
}
