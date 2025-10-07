package object_oriented_programming.inheritance;

public class Electronic extends Product{
   private int warranty;

    Electronic(int id,String name,double price,int warranty)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.warranty=warranty;
    }

    public void ProductDetails()
    {
        System.out.printf("\nid:%d\nname:%s\nprice:%.2f\nwarranty:%d",id,name,price,warranty);
    }
}
