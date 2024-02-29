import java.util.Arrays;
import java.util.Scanner;

public class MultiplePrime {

    public static void main(String[] args) {
        int a;
        int b;
        try(Scanner in = new Scanner(System.in)){
            a = in.nextInt();
            b = in.nextInt();
        }
        for(int i = a ; i<=b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }


    }
    public static boolean isPrime(int n)
    {

        boolean x = true;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                x = false;
            }
        }
        return x;
    }

}

