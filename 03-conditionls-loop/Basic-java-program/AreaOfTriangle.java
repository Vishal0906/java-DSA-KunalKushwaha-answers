import java.util.Scanner;
import java.lang.Math;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of Triangle");
        int n = input.nextInt();
        System.out.println("Enter the base of Triangle");
        int m = input.nextInt();
        System.out.println("Area of Triangle is" + (Math.pow(((Math.pow(n,2)-Math.pow(m,2))/4),0.5))*m);
    }
}
