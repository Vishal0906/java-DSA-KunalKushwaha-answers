import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,n1=0,n2=1,temp=1,new1;
        n = input.nextInt();
        while(temp<=n) {
            if(temp == 1){
                System.out.println(n1);
            }if(temp==2){
                System.out.println(n2);
            }else{
                new1 = n1 + n2;
                System.out.println(new1);
                n1 = n2;
                n2 = new1;
            }
            temp=temp+1;
        }
    }
}
