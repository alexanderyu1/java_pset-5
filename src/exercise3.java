import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter three integers.");

        Scanner in = new Scanner(System.in);

        System.out.print("\n" + "Enter integer: ");
        int integer1 = in.nextInt();
        System.out.print("Enter integer: ");
        int integer2 = in.nextInt();
        System.out.print("Enter integer: ");
        int integer3 = in.nextInt();

        in.close();

        if (integer1 < integer2 && integer2 < integer3) {
            System.out.println("\n" + "Strictly increasing.");
        }
        else if (integer1 == integer2 && integer2 == integer3) {
            System.out.println("\n" + "Same.");
        }
        else if (integer1 <= integer2 && integer2 <= integer3) {
            System.out.println("\n" + "Increasing.");
        }
        else if (integer1 >= integer2 && integer2 >= integer3) {
            System.out.println("\n" + "Decreasing.");
        }
        else if (integer1 > integer2 && integer2 > integer3) {
            System.out.println("\n" + "Strictly decreasing.");
        }
        else {
            System.out.println("\n" + "Unordered.");
        }
    }
}
