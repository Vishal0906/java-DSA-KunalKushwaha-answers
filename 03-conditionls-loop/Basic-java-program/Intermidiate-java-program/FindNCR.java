import java.util.Scanner;

public class FindNCR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = input.nextInt();
        System.out.println("enter the value of n");
        int r = input.nextInt();
        int factn=1,factr=1,factnr=1;
  for(int i = 1 ; i<=n ; i++){
          factn = factn*i;
      }
        for(int i = 1 ; i<=r ; i++){
            factr = factr*i;
        }
        for(int i = 1 ; i<=n-r ; i++){
            factnr = factnr*i;
        }
        System.out.println("nCr" + factn/(factr*factnr));
    }
}
