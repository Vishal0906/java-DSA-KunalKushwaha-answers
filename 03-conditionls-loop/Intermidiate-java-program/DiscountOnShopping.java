import java.util.Scanner;

public class DiscountOnShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the price of item");
        int n = input.nextInt();
        if(n<1000){
            System.out.println("bill " + (n-(n*10)/100));
        }else if(n<2000){
            System.out.println("bill " + (n-(n*15)/100));
        }else if(n<3000){
            System.out.println("bill " + (n-(n*20)/100));
        }else{
            System.out.println("bill " + (n-(n*25)/100));
        }

    }
}
