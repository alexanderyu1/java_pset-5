import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        in.close();

        double yearDouble = (double) year;
        double yearDividedBy4 = yearDouble / 4;

        if (yearDividedBy4 == (int) yearDividedBy4) {
            double yearDividedBy100 = yearDouble / 100;
            if (yearDividedBy100 == (int) yearDividedBy100) {
                double yearDividedBy400 = yearDouble / 400;
                if (yearDividedBy400 == (int) yearDividedBy400) {
                    System.out.println("\n" + year + " is a leap year.");
                }
                else {
                    System.out.println("\n" + year + " is not a leap year.");
                }
            }
            else {
                System.out.println("\n" + year + " is a leap year.");
            }
        }
        else {
            System.out.println("\n" + year + " is not a leap year.");
        }
    }
}
