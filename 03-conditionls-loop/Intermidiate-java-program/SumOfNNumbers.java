import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers and to terminate enter zero" );
        int n =1,sum=0;
        while(n!=0){
            n = input.nextInt();
            sum = sum + n;
        }
        System.out.println("sum is " + sum);
    }
}
