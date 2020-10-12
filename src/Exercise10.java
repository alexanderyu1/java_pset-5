import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter wage: ");
        double wage = in.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = in.nextDouble();

        in.close();

        if (wage < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
        }
        else if (hours < 0) {
            System.out.println("\nYour hours must be greater than or equal to 0.0.");
        }
        else if (hours <= 40) {
            double salary = wage * hours;

            System.out.printf("\nYou'll make $" + "%,.2f", salary);
            System.out.println(" this week.");
        }
        else if (hours > 40) {
            double hoursOvertime = hours - 40;
            double salaryWithoutOvertime = 40 * wage;
            double salaryWithOvertime = hoursOvertime * 1.5 * wage;
            double totalSalary = salaryWithoutOvertime + salaryWithOvertime;

            System.out.printf("\nYou'll make $" + "%,.2f", totalSalary);
            System.out.println(" this week.");
        }
    }
}
