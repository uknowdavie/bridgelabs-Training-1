import java.util.Scanner;
public class Reminder{
	main(String[]args){
		Scanner sc =new Scanner(System.in);
		Syestem.out.println("enter the first number");
		int number1=sc.nextInt();
		System.out.println("enter the second number"); 
		int number2=sc.nextInt();
		int quotient=number1/number2;
		int remainder=number1%number2;
		System.out.prinln("the quotient is "+quotient+"and the remainder is"+remainder+"of two numbwr"+number1+"and"+number2);
	}
}