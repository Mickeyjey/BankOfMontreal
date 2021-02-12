public class Futures extends Product{

    public Futures(String ProductId,String exchange, String contractCode, int month, int year) {
        this.getPrice(exchange, contractCode, month, year);
    }

}
