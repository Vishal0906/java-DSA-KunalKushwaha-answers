import java.util.Scanner;

public class Palindorme {
    public static void main(String args[]) {
        int x, number, y = 0, temp = 0,n=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        number = s.nextInt();
        n= number;
        x = number;
        while (number > 0) {
            x = number % 10;
            number = number / 10;
            temp = temp * 10 + x;
        }
        y = n; // Set y to the original number
        if (temp == y) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
