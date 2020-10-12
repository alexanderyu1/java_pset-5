import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        String temperature = in.nextLine().toLowerCase();

        in.close();

        String temperatureValue = temperature.replaceAll("[^0-9]", "");
        double temperatureValueToDouble = Double.parseDouble(temperatureValue);

        if (temperature.contains("-")) {
            temperatureValueToDouble = -temperatureValueToDouble;
        }

        if (temperature.contains("f")) {
            if (temperatureValueToDouble >= 212) {
                System.out.println("\nGas.");
            }
            else if (temperatureValueToDouble < 212 && temperatureValueToDouble > 32) {
                System.out.println("\nLiquid.");
            }
            else if (temperatureValueToDouble <= 32) {
                System.out.println("\nSolid.");
            }
        }
        else if (temperature.contains("c")) {
            if (temperatureValueToDouble >= 100) {
                System.out.println("\nGas.");
            }
            else if (temperatureValueToDouble < 100 && temperatureValueToDouble > 0) {
                System.out.println("\nLiquid.");
            }
            else if (temperatureValueToDouble <= 0) {
                System.out.println("\nSolid.");
            }
        }
        else {
            System.out.println("\nThat's not a valid scale.");
        }
    }
}
