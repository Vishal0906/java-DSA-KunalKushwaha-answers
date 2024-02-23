import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        System.out.println("enter the nth place till you want the series");
        int n = input.nextInt();
        for(int i = 1; i<=n;i++){
            if(i == 1){
                System.out.println(num1+" ");
            } else if (i == 2) {
                System.out.println(num2+" ");
            }else{
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                System.out.println(num3+" ");
            }
        }

    }
}
