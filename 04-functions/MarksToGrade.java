import java.sql.SQLOutput;
import java.util.Scanner;

public class MarksToGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        grade(n);
    }
     static void grade(int n){
        if(n >=91 && 100>=n){
            System.out.println("AA");
        }else if(n >=81 && 91>n){
            System.out.println("AB");
         }else if(n >=71 && 81>n){
            System.out.println("BB");
        }else if(n >=61 && 71>n){
            System.out.println("BC");
        }else if(n >=51 && 61>n){
            System.out.println("DC");
        }else if(n >=41 && 51>n){
            System.out.println("DD");
        }else{
            System.out.println("FAIL");
        }
     }
}
