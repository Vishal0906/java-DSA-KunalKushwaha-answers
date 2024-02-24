import java.util.Scanner;

public class Parameter0fEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of Equilateral Triangle");
        int n = input.nextInt();
        System.out.println("Parameter of Triangle" + (3*n));
    }
}
