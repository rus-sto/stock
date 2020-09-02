package by.jrr.ruslan.stock_tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class StockServiceTest {

    @Test
    public  void  updatePriceTest(){
        StockService stockService = new StockService();
        Stock stock= new Stock("Conc", 100);
        double newPrice [] = {90,120,70,150};
        double expectedMaxPrice []= {100,120,120,150};
        double expectedMinPrice [] = {90,90,70, 70};
        for (int i=0; i<expectedMaxPrice.length; i++) {
            stockService.updatePrice(stock, newPrice[i]);
            double actualMaxPrice = stock.getMaxPrice();
            double actualMinPrice = stock.getMinPrice();
            assertEquals(expectedMaxPrice[i], actualMaxPrice, 0);
            assertEquals(expectedMinPrice[i], actualMinPrice, 0);
        }

    }
    @Test
    public void printInformation(){
        StockService stockService= new StockService();
        Stock stock = new Stock("Conc", 100);
        String expectedInformation ="Company: Conc. minimal price was - 100.0 USD, maximum price was - 100.0USD, ACTUAL price is 100.0USD";
        String actualInformation =stockService.printInformation(stock);
        assertEquals(expectedInformation,actualInformation);
    }

}