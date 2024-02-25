import java.util.Scanner;

public class CalculateDistanceBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinate in x1 y1 x2 y2 format");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        double length = Math.pow((x1-x2),2) + Math.pow((y1-y2),2);
        length = Math.pow(length,0.5);
        System.out.println("distance " + length);
    }
}
