import java.util.Scanner;
public class CompundInterest {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
            double principal = input.nextDouble();
            double rate = input.nextDouble();
            int time = input.nextInt();

            double compoundInterest = principal * Math.pow((1 + rate/100), time);

            System.out.println("Compound Interest: " + compoundInterest);
        }
    }

