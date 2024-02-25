import java.util.Scanner;

public class PowerInjava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number and its power");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(Math.pow(a,b));
    }
}
