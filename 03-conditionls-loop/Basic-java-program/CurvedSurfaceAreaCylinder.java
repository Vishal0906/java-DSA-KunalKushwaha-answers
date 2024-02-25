import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of Cylinder");
        int n = input.nextInt();
        System.out.println("Enter the radius length of Cylinder");
        int m = input.nextInt();
        System.out.println("Volume of Cylinder" + 3.14*m*m + 2*3.14*n*m);

    }
}
