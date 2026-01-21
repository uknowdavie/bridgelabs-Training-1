import java.util.Scanner;
class harry
{
	public static void main (String args [])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter birth year");
		int a=sc.nextInt();
		System.out.println("enter current year");
		int b=sc.nextInt();
		int sub=b-a;
		System.out.println("age of harry:-"+sub);
	}
}