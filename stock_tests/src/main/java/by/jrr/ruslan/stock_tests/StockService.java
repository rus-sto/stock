package by.jrr.ruslan.stock_tests;

public class StockService {
    public void updatePrice(Stock stock,double newPrice){
        stock.setActualPrice(newPrice);
        if (newPrice<stock.minPrice) {
            stock.setMinPrice(newPrice);
        } else if (newPrice>stock.maxPrice){
            stock.setMaxPrice(newPrice);
        }
    }
    public String printInformation(Stock stock){
        return  "Company: "+ stock.getCompanyName()+". minimal price was - "+stock.getMinPrice()+" USD, maximum price was - "+stock.getMaxPrice()+"USD, ACTUAL price is "+stock.getActualPrice()+"USD";
       }
}

