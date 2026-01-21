import java.util.Scanner;
public class Height{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height in cm:");
		double cm=sc.nextDouble();
		double inches=cm/2.54;
		int feat=(int)inches/12;
		double remaininginches=inches%12;
		System.out.println("your height in cm is"+cm);
		System.out.println("height in feet is "+feet+"ans inches is"+remaininginches);
	}
}