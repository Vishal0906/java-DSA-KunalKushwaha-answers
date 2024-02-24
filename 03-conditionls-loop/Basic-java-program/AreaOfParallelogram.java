import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of Parallelogram");
        int n = input.nextInt();
        System.out.println("Enter the base of Parallelogram");
        int m = input.nextInt();
        System.out.println("Area of Parallelogram" + (n*m));
    }
}
