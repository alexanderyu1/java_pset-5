import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a playing card: ");
        String card = in.next().toUpperCase();

        in.close();

        String suit = "error";
        String rank = "error";

        //if statements for suits
        if (card.contains("C")) {
            suit = "Clubs";
        }
        else if (card.contains("D")) {
            suit = "Diamonds";
        }
        else if (card.contains("H")) {
            suit = "Hearts";
        }
        else if (card.contains("S")) {
            suit = "Spades";
        }

        //if statements for rank
        if (card.contains("2")) {
            rank = "Two";
        }
        else if (card.contains("3")) {
            rank = "Three";
        }
        else if (card.contains("4")) {
            rank = "Four";
        }
        else if (card.contains("5")) {
            rank = "Five";
        }
        else if (card.contains("6")) {
            rank = "Six";
        }
        else if (card.contains("7")) {
            rank = "Seven";
        }
        else if (card.contains("8")) {
            rank = "Eight";
        }
        else if (card.contains("9")) {
            rank = "Nine";
        }
        else if (card.contains("T")) {
            rank = "Ten";
        }
        else if (card.contains("J")) {
            rank = "Jack";
        }
        else if (card.contains("Q")) {
            rank = "Queen";
        }
        else if (card.contains("K")) {
            rank = "King";
        }
        else if (card.contains("A")) {
            rank = "Ace";
        }

        //if statements for error messages
        if (suit.equals("error") && rank.equals("error")) {
            System.out.println("\nThat's not a valid card.");
        }
        else if (suit.equals("error")) {
            System.out.println("\nThat's not a valid suit.");
        }
        else if (rank.equals("error")) {
            System.out.println("\nThat's not a valid rank.");
        }
        else {
            System.out.println("\n" + rank + " of " + suit + ".");
        }
    }
}
