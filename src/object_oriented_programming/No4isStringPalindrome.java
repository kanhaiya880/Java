/*
write a code to pass a stirng word to a method called is palinderome string word and the return ty0e of this menthod should be boolean
check in is palinderome id the word is palinderome or not and return either true or false
 */




package object_oriented_programming;

public class No4isStringPalindrome {
    public boolean isPalindrome(String str1)
    {
        String str2=new StringBuffer(str1).reverse().toString();
        return str1.equalsIgnoreCase(str2);
    }
    public static void main(String[] args) {
        No4isStringPalindrome nsp=new No4isStringPalindrome();
        String result=(nsp.isPalindrome("kkk"))? "given string is palindrome": "given string is not palindrome";
        System.out.println(result);

    }
}
