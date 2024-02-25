import java.util.Scanner;

public class SumOfPositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers and to terminate enter zero" );
        int n =1,sum=0,sumn=0;
        while(n!=0){
            n = input.nextInt();
            if(n>0){
                sum = sum + n;
            }
            if(n<0){
                sumn = sumn + n;
            }

        }
        System.out.println("Positive sum is " + sum);
        System.out.println("Negative sum is " + sumn);

    }
}
