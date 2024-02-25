import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the runs in an over");
        int sum =0;
        for(int i = 1 ; i<=6 ;i++){
            int n = input.nextInt();
            sum = sum + n;
        }
        System.out.println("average " +sum/6);
    }
}
