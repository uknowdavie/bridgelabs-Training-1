import java.util.Scanner;
class profitloss
{
	public static void main (String args [])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter selling price");
		int sp=sc.nextInt();
		System.out.println("enter cost price");
		int cp=sc.nextInt();
		double pl=sp-cp;
		double  pp=(pl/cp)*100;
		System.out.println("profit and loss=>"+pl);
		System.out.println("profit percentage=>"+pp);
	}
}