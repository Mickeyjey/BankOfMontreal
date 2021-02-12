import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

public class ProductFactoryTest {

    @Mock
    Product stock1 = mock(Stock.class);
    Product future = mock(Futures.class);

    @Test
    public void getStockProduct() {
        Product product = new ProductFactory().getProduct("T2","T43","REST");
        Assertions.assertEquals(stock1.getClass(),product.getClass());
    }

    @Test
    public void getFuturesProduct() {
        Product product = new ProductFactory().getProduct("T2","T43","REST",89,100);
        Assertions.assertEquals(future.getClass(),product.getClass());
    }

}