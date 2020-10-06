import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        in.close();

        if (integer > 0) {
            System.out.print("\n" + "Positive.");
        }
        else if (integer < 0) {
            System.out.print("\n" + "Negative.");
        }
        else if (integer == 0) {
            System.out.print("\n" + "Zero.");
        }
    }
}
