public class ex9 {
    public static void main(String[] args) {
        // Create a Stock object with the stock symbol ORCL, the name Oracle Corporation
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        // Set the previous closing price of 34.5
        stock.setPreviousClosingPrice(34.5);
        // Set a new current price to 34.35
        stock.setCurrentPrice(34.35);

        // Display the price-change percentage
        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Previous Closing Price: " + stock.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");
    }
}