package object_oriented_programming.polymorphism.overriding;

class Shape {
    public void area()
    {
        System.out.println("area of shape");
    }

    public static void main(String[] args) {

        Shape circle=new Circle();
        circle.area();
        Shape Rectangle=new Rectangle();
        Rectangle.area();

    }
}

class Circle extends Shape
{
    public void area()
    {
        System.out.println("Area of circle");
    }
}
class Rectangle extends Shape
{
    public void area()
    {
        System.out.println("Area of rectangle");
    }
}