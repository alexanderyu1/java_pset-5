import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double grade = in.nextDouble();

        in.close();

        int status = 0; //if status is 1 then don't print letter grade, only print invalid message

        if (grade >= 100) {
            status = 1;
            System.out.println("Grades above 100 are invalid.");
        }
        else if (grade < 0) {
            status = 1;
            System.out.println("Grades below 0 are invalid.");
        }

        String letterGrade = "error";

        int gradeRounded = (int) Math.rint(grade);

        if (100 >= gradeRounded && gradeRounded >= 90) {
            letterGrade = "A";
        }
        else if (89 >= gradeRounded && gradeRounded >= 80) {
            letterGrade = "B";
        }
        else if (79 >= gradeRounded && gradeRounded >= 70) {
            letterGrade = "C";
        }
        else if (69 >= gradeRounded && gradeRounded >= 60) {
            letterGrade = "D";
        }
        else if (59 >= gradeRounded && gradeRounded >= 0) {
            letterGrade = "F";
        }

        if (status == 0 && (letterGrade.contains("B") || letterGrade.contains("C") || letterGrade.contains("D"))) {
            System.out.println("\n" + "You received a " + letterGrade + ".");
        }
        else if (status == 0 && (letterGrade.contains("A") || letterGrade.contains("F"))) {
            System.out.println("\n" + "You received an " + letterGrade + ".");
        }
    }
}
