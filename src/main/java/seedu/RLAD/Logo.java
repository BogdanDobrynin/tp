package seedu.RLAD;

public class Logo {
  private static final String SEPARATOR = "_________________________________";
  private static final String LOGO =
          " ██████╗  ██╗       █████╗  ██████╗ \n" +
                  " ██╔══██╗ ██║      ██╔══██╗ ██╔══██╗\n" +
                  " ██████╔╝ ██║      ███████║ ██║  ██║\n" +
                  " ██╔══██╗ ██║      ██╔══██║ ██║  ██║\n" +
                  " ██║  ██║ ███████╗ ██║  ██║ ██████╔╝\n" +
                  " ╚═╝  ╚═╝ ╚══════╝ ╚═╝  ╚═╝ ╚═════╝ \n" +
                  "  Record   Losses   And   Debt";
  public static void printRLAD() {
    System.out.println(SEPARATOR);
    System.out.println(LOGO);
    System.out.println(SEPARATOR);
  }
}