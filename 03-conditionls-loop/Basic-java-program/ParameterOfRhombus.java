import java.util.Scanner;

public class ParameterOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side1 of Rhombus");
        int n = input.nextInt();
        System.out.println("Parameter of Rhombus" + 4*(n));
    }
}