import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base, height, area;

        System.out.print("Enter base: ");
        base = sc.nextFloat();

        System.out.print("Enter height: ");
        height = sc.nextFloat();

        area = 0.5f * base * height;

        System.out.println("Area of triangle = " + area);
    }
}
