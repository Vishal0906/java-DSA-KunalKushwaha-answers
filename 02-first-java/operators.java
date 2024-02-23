import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("addition" + " " + (num1+num2) );
        System.out.println("subtratction" + " " + (num1-num2));
        System.out.println("multiplication" + " " + (num1*num2));
        System.out.println("division" + " " + (num1/num2));

    }
}
