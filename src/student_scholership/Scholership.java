package student_scholership;

public class Scholership extends Student{

    public  void putData ()
    {
        if (marks>=80)
        {
            System.out.print(name);
        }

    }

    public static void main(String[] args) {
        Scholership obj=new Scholership();
        obj.getData();
        obj.putData();
    }
}
