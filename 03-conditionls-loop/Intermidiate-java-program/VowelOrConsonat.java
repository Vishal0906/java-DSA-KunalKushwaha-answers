import java.util.Scanner;
public class VowelOrConsonat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
    if((ch >= 'a' && ch <='z') || (ch>='A' && ch<='Z') ){
        switch(ch){
            case 'a','e','i','o','u','A','E','I','O','U' -> System.out.println("vowel");
            default -> System.out.println("Consonant");
        }
    }

    }
}
