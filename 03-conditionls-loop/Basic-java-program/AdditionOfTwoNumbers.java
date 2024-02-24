import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        int n1 = input.nextInt();
        System.out.println("enter the second number");
        int n2 = input.nextInt();
        System.out.println( "Sum of two numbers " + (n1+n2));
    }
}
