public class Futures extends Product{

    private String exchange;
    private String contractCode;
    private int month;
    private int year;

    public Futures(String ProductId,String exchange, String contractCode, int month, int year) {
        this.getPrice(exchange, contractCode, month, year);
    }

}
