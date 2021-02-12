public class Stock extends Product{

    public Stock(String productId,String exchange, String ticker) {
        this.getPrice(exchange, ticker);
    }

}
