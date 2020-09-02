package by.jrr.ruslan.stock_tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {

    @Test
    public void getCompanyName() {
        Stock stock = new Stock("Mac",30);
        String expected = "Mac";
        String actual = stock.getCompanyName();
        assertEquals(expected,actual);
    }

    @Test
    public void getActualPrice() {
        Stock stock = new Stock("Mac",30.0);
        double expected = 30.0;
        double actual = stock.getActualPrice();
        assertEquals(expected,actual,0);
    }

    @Test
    public void getMinPrice() {
        Stock stock = new Stock("Mac",30.0);
        double expected = 30.0;
        double actual = stock.getActualPrice();
        assertEquals(expected,actual,0);
    }

    @Test
    public void getMaxPrice() {
        Stock stock = new Stock("Mac",30.0);
        double expected = 30.0;
        double actual = stock.getActualPrice();
        assertEquals(expected,actual,0);
    }

    @Test
    public void testEquals() {
        Stock stock1 = new Stock("Mac",30);
        Stock stock2 = new Stock("Mac",30);
        boolean expected = true;
        boolean actual = stock1.equals(stock2);
        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        Stock stock = new Stock("Mac",30);
        String expected = "Stock{companyName='Mac', actualPrice=30.0, minPrice=30.0, maxPrice=30.0}";
        String actual = stock.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void testHashCode() {
        Stock stock = new Stock("Mac",30);
        int expected = -1183504398;
        int actual =stock.hashCode();
        assertEquals(expected,actual);
    }
}