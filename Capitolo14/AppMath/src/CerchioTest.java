import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CerchioTest {

    @Test
    void shouldCalculateAreaAndPerimeterCorrectly() {
        double raggio = 5.0;
        Cerchio cerchio = new Cerchio(raggio);

        double area = cerchio.area();
        double perimetro = cerchio.perimetro();

        assertEquals(Math.PI * raggio * raggio, area, 0.001);
        assertEquals(2 * Math.PI * raggio, perimetro, 0.001);
    }

}