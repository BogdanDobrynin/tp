package seedu.RLAD;

import java.util.ArrayList;

public class TransactionManager {
    private final ArrayList<Transaction> transactions = new ArrayList<>();

    public void add(Transaction t) {
        transactions.add(t);
    }

    public void listAll() {
        if (transactions.isEmpty()) {
            System.out.println("Your wallet is empty (and so is this list).");
            return;
        }
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
