/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 9.2(The Stock class) Following the example of the Circle class in Section 9.2,
 * design a class named Stock that contains:
 * - A string data field named symbol for the stock's symbol.
 * - A string data field named name for the stock's name.
 * - a double data field named previousClosingPrice that stores the stock price
 *   for the previous day.
 * - A double data field named currentPrice that stores the stock price for the 
 *   current time.
 * - A constructor that creates a stock with the specified symbol and name.
 * - A method named getChangePercent() that returns the percentage changed from
 *   previousClosingPrice to currentPrice.
 * Draw the UML diagram for the class then implement the class. Write a test program
 * that creates a Stock object with the stock symbol ORCL, the name Oracle Corporation,
 * and the previous closing price of 34.5. Set a new current price to 34.35 and 
 * display the price-change percentage.
 */
package stock;

/**
 *
 * @author Edgar Santana
 */
public class Stock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println("Stock Symbol: " + stock.symbol + 
                "\nStock Name: " + stock.name + 
                "\nStock Previous Closing Price: " + stock.previousClosingPrice + 
                "\nStock Current Price: " + stock.currentPrice +
                "\nStock Percent Price Change: " + String.format("%.2f",stock.getChangePercent()) +"%");
    }
    
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    Stock(String newSymbol, String newName, double newPreviousClosingPrice, double newCurrentPrice) {
        symbol = newSymbol;
        name = newName;
        previousClosingPrice = newPreviousClosingPrice;
        currentPrice = newCurrentPrice;
    }
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}
