import java.util.*;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        try (Scanner in = new Scanner(System.in)) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }
        pythagorean( a, b, c);
        }
        static void pythagorean(int a,int b,int c){
         int one=0,two=0,three=0;
          if(a > b && a >c ){
              one = a;
              if(b>c){
                  two = b;
                  three = c;
              }else{
                  two = c;
                  three = b;
              }
          }else if(b>a && b>c){
              one = b;
              if(c>a){
                  two = c;
                  three = a;
              }else{
                  two = a;
                  three = c;
              }
          }else{
              one = c;
              if (b > a) {
                  two = b;
                  three =a;
              }else{
                  two = a;
                  three =b;
              }
          }

          if((Math.pow(three, 2) + Math.pow(two, 2)) == Math.pow(one, 2)){
              System.out.println("pythagorean triplet");
          }else{
              System.out.println("not a Pythagorean triplet");
          }
            System.out.println(one + " " +two +" "+three);
        }
    }

