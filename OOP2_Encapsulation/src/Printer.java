public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexCheck;
    public Printer(int tonerLevel, boolean duplexCheck) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplexCheck = duplexCheck;
    }
    public int fillLevel(int fillValue) {
        if (fillValue > 0 && fillValue <= 100) {
            if (this.tonerLevel + fillValue > 100) {
                return -1;
            }
            this.tonerLevel += fillValue;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }
    public int printPage(int page) {
        int pagesToPrint = page;
        if (tonerLevel <= 2) {
            System.out.println("Refill the Cartridge");
        } else {
            if(this.duplexCheck){
                this.pagesPrinted+=(page/2)+(page%2);
                tonerLevel -= page*2;
                System.out.println("Printing in Duplex Mode");
            } else {
                this.pagesPrinted+=page;
                tonerLevel -= page*2;
                System.out.println("Printing in non-duplex mode");
            }
            return pagesToPrint;
        }
        return 0;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}