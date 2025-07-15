class Main {
    public static void main(String[] args) {
        System.out.println(Myclass.a);
        Student obj1=new Student();
        obj1.display();

    }
}

class Student
{
    public int a=8;
    void display()
    {
        System.out.println("This a :"+a);
    }
}