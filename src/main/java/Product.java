public abstract class Product{
    protected String productId;
    protected double currentPrice;


    protected void getPrice(String exchange, String ticker){

        this.currentPrice = new ProductService().price(exchange, ticker);
    }
    protected void getPrice(String exchange, String contractCode, int month, int year){

        this.currentPrice = new ProductService().price(exchange, contractCode, month, year);
    }
}
