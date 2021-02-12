import org.junit.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductTest {
    @Mock
    ProductService pService = mock(ProductService.class);
    @Test
    public void testGetStockPrice(){

        when(pService.price("t1","t4")).thenReturn(123.0);
        assertEquals(123.0,pService.price("t1","t4"));
    }

    @Test
    public void testGetFuturePrice(){
        when(pService.price("t1","t4",3,2020)).thenReturn(2123.0);
        assertEquals(2123.0,pService.price("t1","t4",3,2020));
    }



}