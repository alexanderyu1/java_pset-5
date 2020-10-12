import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a month: ");
        String month = in.next().toLowerCase();

        in.close();

        if (month.contains("jan")) {
            System.out.println("\n31 days.");
        }
        else if (month.contains("feb")) {
            System.out.println("\n28 or 29 days.");
        }
        else if (month.contains("mar")) {
            System.out.println("\n31 days.");
        }
        else if (month.contains("apr")) {
            System.out.println("\n30 days.");
        }
        else if (month.contains("may")) {
            System.out.println("\n31 days.");
        }
        else if (month.contains("jun")) {
            System.out.println("\n30 days.");
        }
        else if (month.contains("jul")) {
            System.out.println("\n31 days.");
        }
        else if (month.contains("aug")) {
            System.out.println("\n31 days.");
        }
        else if (month.contains("sep")) {
            System.out.println("\n30 days.");
        }
        else if (month.contains("nov")) {
            System.out.println("\n31 days.");
        }
        else if (month.contains("dec")) {
            System.out.println("\n30 days.");
        }
        else {
            System.out.println("\nThat's not a valid month.");
        }
    }
}
