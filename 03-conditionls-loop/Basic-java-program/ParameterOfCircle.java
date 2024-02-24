import java.util.Scanner;

public class ParameterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        int n = input.nextInt();
        System.out.println("Parameter of Circle" + (3.14*n*2));
    }

}
