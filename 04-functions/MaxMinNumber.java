
import  java.util.*;

public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("maximum " + max(a,b,c));
        System.out.println("minimum " + min(a,b,c));
    }

    static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>c){
            return b;
        }else{
            return c;
        }
    }

    static int min(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }else if(b<c){
            return b;
        }else{
            return c;
        }
    }


}
