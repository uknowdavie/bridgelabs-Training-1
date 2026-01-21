import java.util.Scanner;
class average
{
	public static void main (String args [])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("eneter marks in maths");
		int a=sc.nextInt();
		System.out.println("marks in physics");
		int b=sc.nextInt();
		System.out.println("marks in chemistry");
		int c=sc.nextInt();
		int avg=(a+b+c)/3;
		System.out.println("average=>"+avg);
	}
}