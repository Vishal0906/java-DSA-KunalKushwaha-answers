import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = prime(n);
        if(i == 2){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
    static int prime(int a){
        int x =0;
        for(int i = 2;i<a;i++){
            if(a%i==0){
                  x = 2;
            }
        }
return x;
    }
}
