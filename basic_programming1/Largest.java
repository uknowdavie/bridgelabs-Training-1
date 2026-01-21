import java.util.Scanner;
class Largest{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number=>);
		int a=sc.nextInt;
		System.out.println("enter the second number=>");
		int b=sc.nextInt;
		System.out.println("enter the third number=>");
		int c=sc.nextInt;
		if(a > b && a > c){
		System.out.println("first number is largest");
		}else{
        System.out.println("first number is not largest");
		}
	}
}	