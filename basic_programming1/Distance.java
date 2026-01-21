import java.util.Scanner;

class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float feet, yards, miles;

        System.out.print("Enter distance in feet: ");
        feet = sc.nextFloat();

        yards = feet / 3;
        miles = yards / 1760;

        System.out.println("Distance in yards = " + yards);
        System.out.println("Distance in miles = " + miles);
    }
}
