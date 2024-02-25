import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of Triangle");
        int n = input.nextInt();
        System.out.println("Area of Triangle" + ((Math.pow(3,0.5)/4)*n*n));
    }
}

