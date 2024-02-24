import java.util.Scanner;

public class AreaOfIsocelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of Triangle");
        int n = input.nextInt();
        System.out.println("Enter the base of Triangle");
        int m = input.nextInt();
        System.out.println("Area of Triangle is" + (0.5*n*n));
    }
}
