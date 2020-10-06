import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        in.close();

        double integerMod = (double) integer / 2;

        if (integerMod % 1 == 0) {
            System.out.print("\n" + "Even.");
        }
        else {
            System.out.print("\n" + "Odd.");
        }
    }
}
