import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the unit of Electricity used");
        int n = input.nextInt();
        if(n<100){
             System.out.println("bill " + n*10);
        }else if(n<200){
            System.out.println("bill " + n*15);
        }else if(n<300){
            System.out.println("bill " + n*20);
        }else{
            System.out.println("bill " + n*25);
        }

    }
}
