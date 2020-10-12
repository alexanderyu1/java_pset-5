import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        in.close();

        if (integer > 0) {
            System.out.println("\n" + "Positive.");
        }
        else if (integer < 0) {
            System.out.println("\n" + "Negative.");
        }
        else if (integer == 0) {
            System.out.println("\n" + "Zero.");
        }
    }
}
