package CollectionFramework.arraylistprogram;

import object_oriented_programming.inheritance.Product;

import java.util.ArrayList;

public class No02_TestProduct {
    public static void main(String[] args) {
        No02_Product pro1=new No02_Product(101,"Chloromint","dubar mat puchana",2);
        No02_Product pro2=new No02_Product(202,"Red Bull","Gives You wings",125);
        No02_Product pro3=new No02_Product(303,"5-Star","Eat five star, do nothing",20);
        No02_Product pro4=new No02_Product(404,"Melody","Melody itni chocolaty kyu hai",2);
        No02_Product pro5=new No02_Product(505,"Ghadi","Pehle istemal karo fir vishwas karo",60);

        ArrayList <No02_Product> products= new ArrayList<No02_Product>();
        products.add(pro1);
        products.add(pro2);
        products.add(pro3);
        products.add(pro4);
        products.add(pro5);


        for (No02_Product p : products)
        {
            if (p.getPrice()>20)
            {
                System.out.println(p.getName()+"----------------"+p.getTagline());
            }
        }
    }
}
