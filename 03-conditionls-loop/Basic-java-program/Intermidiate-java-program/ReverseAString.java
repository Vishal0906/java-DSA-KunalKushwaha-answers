import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        String reversed = "";
        char[] ch = input.toCharArray();
        int l = input.length();
        for(int i = l-1 ; i>=0 ; i--){
            reversed = reversed + ch[i];
        }
        System.out.println(reversed);
    }
}
