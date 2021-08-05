import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(60, true);

        System.out.println("No. of pages printed now: "+printer.printPage(8));
        System.out.println("Total no. of pages printed: "+printer.getPagesPrinted());

        System.out.println("No. of pages printed now: "+printer.printPage(101));
        System.out.println("Total no. of pages printed: "+printer.getPagesPrinted());

        System.out.println("No. of pages printed now: "+printer.printPage(560));
        System.out.println("Total no. of pages printed: "+printer.getPagesPrinted());
    }
}
