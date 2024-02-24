import java.util.Scanner;

public class VolumeOfsphere {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Eneter the radius of Sphere");
            int r = input.nextInt();
            System.out.println("Volume of sphere "+(float)(4/3)*3.14*r*r*r);
    }
}
