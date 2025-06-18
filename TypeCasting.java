public class TypeCasting
{
	public static void main(String args[])
	{
		//widening
		int a=123;
		double d=a;
		System.out.println("Converted value is ="+d);
		//narrowing
		d=123.456;
		a=(int)d;
		System.out.println("value of a is :"+a);
		
		//// here range of byte is -128 to 127 so it will note store 130 will will loop and come -126
		a=130;
		byte b=(byte)a;
		System.out.println("value of byte"+b);
		System.out.println("********************************************");
		
		
	}
}
