import static org.junit.Assert.assertEquals;
import org.junit.Test;
import services.ServicioA;
import services.impl.ServicioAImpl;

public class TestServicioA {

    @Test
    public void testSumar(){
        int a = 7;
        int b = 2;
        ServicioA servicioA = new ServicioAImpl();
        assertEquals(2+2,4);
    }

}
