import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int handshakes;

        System.out.print("Enter number of students: ");
        n = sc.nextInt();

        handshakes = n * (n - 1) / 2;

        System.out.println("Maximum number of handshakes = " + handshakes);
    }
}
