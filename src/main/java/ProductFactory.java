public class ProductFactory {

    public Product getProduct(String productId,String exchange, String contractCode, int month, int year) {
        return new Futures(productId,exchange,contractCode,month,year);
    }

    public Product getProduct(String productId,String exchange, String ticker) {
        return new Stock(productId,exchange,ticker);
    }
}
