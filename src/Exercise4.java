import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letterGrade = in.nextLine().toUpperCase();

        in.close();

        letterGrade = letterGrade.replaceAll(" ", "");

        int letterGradeStringLength = letterGrade.length();
        double numberGrade = 0;
        int status = 0; //if status is 1, then don't print GPA, only print error message

        if (letterGrade.contains("F") && (letterGrade.contains("-") || (letterGrade.contains("+")))) {
            status = 1;
            System.out.println("\n" + "That's not a valid letter grade.");
        }

        if (letterGradeStringLength > 2) {
            status = 1;
            System.out.println("\n" + "That's not a valid letter grade.");
        }
        else if (letterGrade.contains("+")) {
            numberGrade += 0.33;
        }
        else if (letterGrade.contains("-")) {
            numberGrade -= 0.33;
        }

        if (letterGrade.contains("A")) {
            numberGrade += 4.00;
        }
        else if (letterGrade.contains("B")) {
            numberGrade += 3.00;
        }
        else if (letterGrade.contains("C")) {
            numberGrade += 2.00;
        }
        else if (letterGrade.contains("D")) {
            numberGrade += 1.00;
        }
        else if (letterGrade.contains("F")) {
            numberGrade += 0.00;
        }
        else {
            status = 1;
            System.out.println("\n" + "That's not a valid letter grade.");
        }

        if (numberGrade >= 4.00) {
            numberGrade = 4.00;
        }

        if (status != 1) {
            System.out.print("\n" + "Your GPA is ");
            System.out.printf("%.2f", numberGrade);
            System.out.println(".");
        }
    }
}
