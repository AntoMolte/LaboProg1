import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RettangoloTest {

    @ParameterizedTest
    @CsvSource({
            "3.0, 4.0, 12.0",
            "5.0, 5.0, 25.0",
            "1.0, 10.0, 10.0",
            "2.5, 4.0, 10.0"
    })
    void shouldCalculateAreaCorrectly(double base, double altezza, double areaAttesa) {
        Rettangolo rettangolo = new Rettangolo(base, altezza);
        double areaCalcolata = rettangolo.area();
        assertEquals(areaAttesa, areaCalcolata, 0.001);
    }
}