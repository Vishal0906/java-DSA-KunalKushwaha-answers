import java.util.Scanner;

public class PrintLargestuntil0Integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0,largest=0;
        do{
            n = input.nextInt();
           if(largest < n){
              largest = n;
           }
        }while(n!=0);
      System.out.println("Largest " + largest);
    }
}
