package seedu.RLAD;

import java.util.ArrayList;
import java.util.Scanner;

public class addTransaction {
    private static int index = 0;

    public addTransaction (ArrayList<Double> income, ArrayList<Double> expenses, ArrayList<String> category, Scanner scanner) {
        System.out.print("Income: $");
        double incomeValue = Double.parseDouble(scanner.nextLine());
        income.add(incomeValue);

        System.out.print("Expense: $");
        double expenseValue = Double.parseDouble(scanner.nextLine());
        expenses.add(expenseValue);

        System.out.print("Category: ");
        String categoryValue = scanner.nextLine();
        category.add(categoryValue);

        index++;
    }
}