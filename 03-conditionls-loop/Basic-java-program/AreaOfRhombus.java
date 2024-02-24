import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Diagnol1 of Rhombus");
        int n = input.nextInt();
        System.out.println("Enter the Diagnol2 of Rhombus");
        int m = input.nextInt();
        System.out.println("Area of Rhombus" + (0.5*n*m));
    }
}

