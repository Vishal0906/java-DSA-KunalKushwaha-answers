import java.util.Scanner;
public class DepriciationOfValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the price of item");
        int n = input.nextInt();
        if(n<1000){
            System.out.println("depriciation " + (n-(n*70)/100));
        }else if(n<2000){
            System.out.println("depriciation" + (n-(n*65)/100));
        }else if(n<3000){
            System.out.println("depriciation " + (n-(n*60)/100));
        }else{
            System.out.println("depriciation " + (n-(n*55)/100));
        }

    }

}
