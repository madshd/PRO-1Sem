package Ex42;

public class Stock {
//    Fields
   private String symbol;
   private String name;

   private double previousClosingPrice;
   private double currentPrice;

   private double changePercent;

    //Constructor
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public void setCurrentPrice (double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }

    public void setPreviousClosingPrice(double newPrevClosingPrice) {
        previousClosingPrice = newPrevClosingPrice;
    }
//metode
    public void getChangePercent() {
        double diff = currentPrice - previousClosingPrice;
        changePercent = (diff / previousClosingPrice) * 100;
    }
// metode
    public String toString() {
        return String.format("Stock: (%s, %s, $%s, %s)", symbol, name, previousClosingPrice, changePercent);
    }

    public void printStock() {
        if (previousClosingPrice == currentPrice) {
            System.out.println("*******************");
            System.out.println("SYMBOL: " + symbol);
            System.out.println("NAME: " + name);
            System.out.println("Prev. CP: " + previousClosingPrice);
            System.out.println("*******************");
        } else {
            System.out.println("*******************");
            System.out.println("SYMBOL: " + symbol);
            System.out.println("NAME: " + name);
            System.out.println("Prev. closing price: $" + previousClosingPrice);
            System.out.println("Closing price: $" + currentPrice);
            System.out.printf("Change percent: %.2f %% \n", changePercent);
            System.out.println("*******************");
        }
    }
    
}



