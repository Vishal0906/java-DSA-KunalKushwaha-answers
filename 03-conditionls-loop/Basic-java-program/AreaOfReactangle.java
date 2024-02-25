import java.util.Scanner;


public class AreaOfReactangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of Rectangle");
        int n = input.nextInt();
        System.out.println("Enter the width of Rectangle");
        int m = input.nextInt();
        System.out.println("Area of Rectangle is" + ( n * m));
    }
}
