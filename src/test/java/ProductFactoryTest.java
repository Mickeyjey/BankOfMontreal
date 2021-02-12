import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductFactoryTest {

    @Mock
    Product stock1 = mock(Stock.class);
    Product future = mock(Futures.class);

    @Test
    public void getStockProduct() {
        when(stock1.price("try","go")).thenReturn(123.0);
        Assertions.assertEquals(123.0,stock1.price("try","go"));

    }

    @Test
    public void getFuturesProduct() {
        when(future.price("try","go")).thenReturn(123.0);
        Assertions.assertEquals(123.0,future.price("try","go"));

    }
}