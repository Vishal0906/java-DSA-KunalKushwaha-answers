import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();
        int SI = (P*T*R)/100;
        System.out.println("simple intrest is" +" "+SI);
    }
}
