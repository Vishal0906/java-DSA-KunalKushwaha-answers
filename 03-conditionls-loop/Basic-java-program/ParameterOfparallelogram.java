import java.util.Scanner;

public class ParameterOfparallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side1 of Parallelogram");
        int n = input.nextInt();
        System.out.println("Enter the side2 of Parallelogram");
        int m = input.nextInt();
        System.out.println("Parameter of Parallelogram" + 2*(n+m));
    }
}
