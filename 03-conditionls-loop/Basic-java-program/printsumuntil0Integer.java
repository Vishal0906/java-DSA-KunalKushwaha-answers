import java.util.Scanner;
public class printsumuntil0Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0,sum=0;
        do{
             n = input.nextInt();
             sum = sum+n;
        }while(n!=0);
        System.out.println("Sum" + sum);
    }
}
