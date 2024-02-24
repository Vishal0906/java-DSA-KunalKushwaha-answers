import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of Prism");
        int n = input.nextInt();
        System.out.println("Enter the base length of Prism");
        int m = input.nextInt();
        System.out.println("Enter the base height of Prism");
        int k = input.nextInt();
        System.out.println("Volume of Prism" + n*m*k);
    }
}