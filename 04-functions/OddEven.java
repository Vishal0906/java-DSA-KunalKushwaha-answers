import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(oddeven(n));
    }
    static String oddeven(int n){
        if(n%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
}
