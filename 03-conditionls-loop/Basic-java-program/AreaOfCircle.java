import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int n = input.nextInt();
        System.out.println("Area of cicrle is" + (3.14*n*n));
    }
}
