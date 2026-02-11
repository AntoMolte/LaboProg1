import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricGarageTest {

    private TeslaModelS tesla;

    @Test
    void shouldIncreaseBatteryLevelWhenAmountIsPositive() {
        int newLevel = tesla.charge(10); // da 50 a 60
        assertEquals(60, newLevel);
        assertEquals(60, tesla.getBatteryLevel());
    }

    @Test
    void shouldCapBatteryAtOneHundredWhenOvercharged() {
        int newLevel = tesla.charge(60); // 50 + 60 = 110, ma max 100
        assertEquals(100, newLevel);
        assertEquals(100, tesla.getBatteryLevel());
    }

    @Test
    void shouldNotChangeBatteryLevelWhenAmountIsNegative() {
        int newLevel = tesla.charge(-20); // negativo, batteria non cambia
        assertEquals(50, newLevel);
        assertEquals(50, tesla.getBatteryLevel());
    }
}