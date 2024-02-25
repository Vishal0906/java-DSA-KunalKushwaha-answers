import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the base area of pyramid");
        int a = input.nextInt();
        System.out.println("enter the height of pyramid");
        int h = input.nextInt();
        System.out.println("Volume of Pyramid" + (float)(1/3)*a*h);
    }
}
