import java.util.Scanner;

public class ProductAndSumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),temp=0,sum=0,prod=1;
        while(n>0){
            temp = n%10;
            sum = sum + temp;
            prod = prod*temp;
            n = n/10;
        }
        System.out.println("sum "+sum);
        System.out.println("prod "+prod);
    }

}
