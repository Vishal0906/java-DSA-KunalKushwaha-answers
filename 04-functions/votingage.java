import java.util.Scanner;

public class votingage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(voting(n));
    }
    static String voting(int n){
        if(n>=18){
            return "eligible to vote";
        }else{
            return "not eligible to vote";
        }
    }
}
