import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side of a cube");
        int n = input.nextInt();
        System.out.println("TSA of a cube is " + 6*n*n);
    }
}
