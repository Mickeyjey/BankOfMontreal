import java.util.HashMap;
import java.util.Map;

public class Trade implements MontrealTradedProducts {
  Map<Product,Integer> products = new HashMap<>();
    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {

    }

    @Override
    public void trade(Product product, int quantity) {
        for (Map.Entry<Product,Integer> entry : products.entrySet()){
            if(entry.getKey().productId==product.productId){
             entry.setValue(entry.getValue()+quantity);
            }
        }

    }

    @Override
    public int totalTradeQuantityForDay() {
        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
