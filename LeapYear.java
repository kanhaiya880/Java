public LeapYear
{
    public static void main(String args[])
    {
        int year = 2020;
        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";
        System.out.println(result);
    }
}