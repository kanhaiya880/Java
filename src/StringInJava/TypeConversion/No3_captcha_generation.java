package StringInJava.TypeConversion;

import java.util.Random;

public class No3_captcha_generation {

    public static void main(String[] args) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int captchaLength = 5;
        String captcha = "";

        Random rand = new Random();

        for (int i = 0; i < captchaLength; i++) {
            int index = rand.nextInt(characters.length());
            captcha += characters.charAt(index);
        }

        System.out.println("Generated CAPTCHA: " + captcha);
    }
}
