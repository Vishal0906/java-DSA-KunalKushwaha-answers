import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),i=2;
        while (i<=n){
            if(n%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
