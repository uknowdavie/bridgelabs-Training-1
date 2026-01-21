import java.util.Scanner;
class kmToMiles
{
	public static void main (String args [])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter kilometres");
		int km=sc.nextInt();
		double miles=km*1.6;
		System.out.println("miles=>"+miles);
	}
}