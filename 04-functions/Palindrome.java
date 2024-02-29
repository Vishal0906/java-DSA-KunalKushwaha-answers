import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Palin(n);
    }

    static void Palin(int n){
        int temp = 0,sum = 0;
        int x = n;
        while(n>0){
            temp = n%10;
            sum = sum*10 + temp;
            n = n/10;
        }
        if(x == sum){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
    }
}
