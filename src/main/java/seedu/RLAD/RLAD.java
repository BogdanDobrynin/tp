package seedu.RLAD;

public class RLAD {
   private final Ui ui;
   private final TransactionManager transactions;

    public RLAD() {
        this.ui = new Ui();
        this.transactions = new TransactionManager();
    }

    public void run() {
        ui.printWelcomeGuide();
        boolean isExit = false;

        while (!isExit) {
            String fullCommand = ui.readCommand();
            ui.showLine();

            // temporary logic until parser is completed
            if (fullCommand.equalsIgnoreCase("exit")) {
                isExit = true;
                ui.showExit();
            } else if (fullCommand.equalsIgnoreCase("list")) {
                transactions.listAll();
            } else {
                ui.showError("I don't know how to '" + fullCommand + "' yet!");
            }
            ui.showLine();
        }
    }

    public static void main(String[] args) {
        new RLAD().run();
    }
}
