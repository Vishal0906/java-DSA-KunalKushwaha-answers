import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),i=1,fact=1;
        while(i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial " + fact);
    }
}
