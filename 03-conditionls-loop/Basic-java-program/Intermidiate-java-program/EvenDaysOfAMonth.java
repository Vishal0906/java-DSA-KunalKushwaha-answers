import java.util.Scanner;
public class EvenDaysOfAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        int numDays=0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 15;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 15;
                break;
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    numDays = 14;
                } else {
                    numDays = 14;
                }
                break;
            default:
                System.out.println("Invalid month.");
        }
        System.out.println(numDays);
    }
}
