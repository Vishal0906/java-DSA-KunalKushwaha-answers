import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Fact(n);
    }
    static void Fact(int n){
        int temp=1;
        for(int i = 1;i<=n;i++){
            temp = temp *i;
        }
        System.out.println(temp);
    }
}
