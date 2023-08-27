import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // You can add more methods here

    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Your expenses while overseas?");
        // TODO: add your code here
        line = in.nextLine();
        String[] words = line.split(" ");
        String[] expenses = new String[10];
        double[] expensesNumerals = new double[10];
        int expensesCount = 0;
        double totalOverseasCurrency = 0;

        for (String word : words) {
            if (word.contains("$")) {
                expenses[expensesCount] = word;
                expensesCount++;
                expensesNumerals[expensesCount] = Double.parseDouble(word.replaceAll("[^\\d.]", ""));
            }
        }
        for (double expensesNumeral : expensesNumerals) {
            totalOverseasCurrency += expensesNumeral;
        }


        System.out.println("Expenses in overseas currency:" + Arrays.toString(Arrays.copyOf(expenses, expensesCount)));
        System.out.println("Total in local currency: " + "$" + String.format("%.2f", totalOverseasCurrency*1.7));
    }
}