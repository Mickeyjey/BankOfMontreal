public class Futures extends Product{

    public Futures(String productId,String exchange, String contractCode, int month, int year) {

    }

    @Override
    public double price(String exchange, String ticker) {
        return 0;
    }

    @Override
    public double price(String exchange, String contractCode, int month, int year) {
        return 0;
    }
}
