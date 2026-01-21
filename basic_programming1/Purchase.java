import java.util.Scanner;

class Purchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float unitPrice;
        int quantity;
        float totalPrice;

        System.out.print("Enter unit price: ");
        unitPrice = sc.nextFloat();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        totalPrice = unitPrice * quantity;

        System.out.println("Total purchase price is INR " + totalPrice);
    }
}
