import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of cone");
        int n = input.nextInt();
        System.out.println("Enter the radius of cone");
        int m = input.nextInt();
        System.out.println("Volume of cone" + 3.14*m*m*n);
    }
}