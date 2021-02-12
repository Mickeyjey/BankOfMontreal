import java.util.HashMap;
import java.util.Map;

public class Trade implements MontrealTradedProducts {
  Map<Product,Integer> products = new HashMap<>();
    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        Product newProduct=null;
        for (Map.Entry<Product,Integer> entry : products.entrySet()){
            if(entry.getKey().productId==product.productId){
                newProduct = entry.getKey();
                break;
            }
        }

        if(newProduct != null){
            products.put(newProduct,0);
        }else{
            throw new ProductAlreadyRegisteredException("Product is already registered");
        }
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
        int sum=0;
        for (Map.Entry<Product,Integer> entry : products.entrySet()){
            sum+=entry.getValue();
        }
        return sum;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        double sum=0;
        for (Map.Entry<Product,Integer> entry : products.entrySet()){
            sum+=(entry.getValue()*entry.getKey().currentPrice);
        }
        return sum;
    }
}
