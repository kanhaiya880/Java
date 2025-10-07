package Abstraction.example3;

public class Chess extends Sports{
    @Override
    public void bestPlayer(String name, int age) {
        System.out.println("THE BEST PLAYER IS:");
        System.out.println(name+" "+age);
    }

    @Override
    public void bestOrganisation(String name) {
        System.out.println("THE BEST BOARD IN WORD");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Sports cricket = new Chess();
        cricket.bestPlayer("Magnas Carlson",26);
        cricket.bestOrganisation("FideWorld");
    }
}
