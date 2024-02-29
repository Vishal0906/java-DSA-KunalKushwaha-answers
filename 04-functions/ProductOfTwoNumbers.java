import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        int pto = product();
        System.out.println(pto);
    }
    static int product(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        return a*b;
}
}
