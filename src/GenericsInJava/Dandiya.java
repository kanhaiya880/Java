package GenericsInJava;

import java.lang.reflect.Type;

public class Dandiya <T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


    public static void main(String[] args)
    {
        Dandiya<String> kapra = new Dandiya<String>();
        kapra.setValue("Kurta");
        System.out.println(kapra.getValue());

        Dandiya <Integer> price=new Dandiya<Integer>();
        price.setValue(1000);
        System.out.println(price.getValue());
        Dandiya <Double> rating= new Dandiya<Double>();
        rating.setValue(5.5);
        System.out.println(rating.getValue());

        Dandiya checkTypeSafe= new Dandiya();     // here it is not type safe
        checkTypeSafe.setValue("hello world");
        System.out.println(checkTypeSafe.getValue());


    }
}

