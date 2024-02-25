import java.util.Scanner;

public class AverageOfNInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n=1 ,count=0,temp=0;
        while(n!=0){
             n = input.nextInt();
             temp = temp+n;
             System.out.println(temp);
            count++;
            System.out.println(count);
         }
         System.out.println("average" + ((float)(temp)/(float)(count-1)));
    }
}
