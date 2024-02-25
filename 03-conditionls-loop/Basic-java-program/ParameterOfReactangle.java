import java.util.Scanner;

public class ParameterOfReactangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side1 of Rectangle");
        int n = input.nextInt();
        System.out.println("Enter the side2 of Rectangle");
        int m = input.nextInt();
        System.out.println("Parameter of Rectangle" + 2*(n+m));
    }
}
