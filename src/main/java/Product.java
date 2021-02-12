public abstract class Product implements ProductPricingService{
    protected String productId;
    protected double currentPrice;

     virtual price(String exchange, String ticker);

    public virtual abstract double price(String exchange, String contractCode, int month, int year);
}
