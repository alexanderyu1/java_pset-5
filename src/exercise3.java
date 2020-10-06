import java.util.Scanner;

public class exercise3 {
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

        
    }
}
