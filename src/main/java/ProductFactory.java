public class ProductFactory {
    private String exchange;
    private  String ticker;
    private  String contractCode;
    private int month;
    private int year;

    public Product getProduct(String productId,String exchange, String contractCode, int month, int year) {
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
        return new Futures(productId,this.exchange,this.contractCode,this.month,this.year);
    }

    public Product getProduct(String productId,String exchange, String ticker) {
        return new Stock(productId,exchange,ticker);
    }
}
