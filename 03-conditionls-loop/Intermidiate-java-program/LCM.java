import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int gcd = 1;
        for (int i = 2; i <= Math.min(n1, n2); ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        System.out.println(gcd);
    }
}
