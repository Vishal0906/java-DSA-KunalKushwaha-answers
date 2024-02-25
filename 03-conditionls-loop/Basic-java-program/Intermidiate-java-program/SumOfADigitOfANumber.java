import java.util.Scanner;

public class SumOfADigitOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),temp=0,sum=0;
        while(n!=0){
            temp = n%10;
            sum = sum + temp;
            n = n/10;
        }
        System.out.println("sum is " + sum);
    }
}
