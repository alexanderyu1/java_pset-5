import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a playing card: ");
        String card = in.next().toUpperCase();

        in.close();

        int cardLength = card.length();
        int statusOfSuit = 0;
        int statusOfRank = 0;

        String cardFirstCharacter = card.substring(0, 1);
        String cardSecondCharacter = card.substring(1);

        String suit = "error";
        String rank = "error";

        //if statements for suits
        if (cardSecondCharacter.contains("C")) {
            suit = "Clubs";
        }
        else if (cardSecondCharacter.contains("D")) {
            suit = "Diamonds";
        }
        else if (cardSecondCharacter.contains("H")) {
            suit = "Hearts";
        }
        else if (cardSecondCharacter.contains("S")) {
            suit = "Spades";
        }
        else {
            statusOfSuit += 1;
        }

        //if statements for rank
        if (cardFirstCharacter.contains("2")) {
            rank = "Two";
        }
        else if (cardFirstCharacter.contains("3")) {
            rank = "Three";
        }
        else if (cardFirstCharacter.contains("4")) {
            rank = "Four";
        }
        else if (cardFirstCharacter.contains("5")) {
            rank = "Five";
        }
        else if (cardFirstCharacter.contains("6")) {
            rank = "Six";
        }
        else if (cardFirstCharacter.contains("7")) {
            rank = "Seven";
        }
        else if (cardFirstCharacter.contains("8")) {
            rank = "Eight";
        }
        else if (cardFirstCharacter.contains("9")) {
            rank = "Nine";
        }
        else if (cardFirstCharacter.contains("T")) {
            rank = "Ten";
        }
        else if (cardFirstCharacter.contains("J")) {
            rank = "Jack";
        }
        else if (cardFirstCharacter.contains("Q")) {
            rank = "Queen";
        }
        else if (cardFirstCharacter.contains("K")) {
            rank = "King";
        }
        else if (cardFirstCharacter.contains("A")) {
            rank = "Ace";
        }
        else {
            statusOfRank += 1;
        }

        //if statements for error messages
        if (cardLength > 2) {
            System.out.println("\nThat's not a valid card.");
        }
        else if (statusOfRank != 0) {
            System.out.println("\nThat's not a rank.");
        }
        else if (statusOfSuit != 0) {
            System.out.println("\nThat's not a suit.");
        }
        else {
            System.out.println("\n" + rank + " of " + suit + ".");
        }
    }
}
