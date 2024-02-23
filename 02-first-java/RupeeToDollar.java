import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rupees");
        float n = input.nextFloat();
        float dollar = (float) (n/(84.3));
        System.out.println("dollar conversion is " + dollar);
    }
}
