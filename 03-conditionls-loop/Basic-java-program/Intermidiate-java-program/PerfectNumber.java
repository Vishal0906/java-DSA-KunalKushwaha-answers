import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),sum=0;
        int x = n;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }

        if(sum == x){
            System.out.println("perfect number");
        }
    }
}
