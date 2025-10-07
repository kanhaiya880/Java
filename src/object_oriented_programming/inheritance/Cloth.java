package object_oriented_programming.inheritance;

public class Cloth extends Product {
    String size;
    Cloth(int id,String name,double price,String size)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.size=size;
    }

    public void ProductDetails()
    {
        System.out.printf("\nid:%d\nname:%s\nprice:%2f\nsize:%s",id,name,price,size);
    }
}
