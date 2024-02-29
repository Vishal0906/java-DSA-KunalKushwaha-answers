import java.util.Scanner;

public class CircumferenceofaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        circle(r);
    }
    static void circle(int r){
        System.out.println(3.14*2*r);
    }
}
