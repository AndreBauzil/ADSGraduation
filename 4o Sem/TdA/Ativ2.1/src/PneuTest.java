import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PneuTest {

    @Test
    void testPrecisaCalibrarPneus() {
        Pneu p = new Pneu(70);
        assertTrue(p.precisaCalibrarPneus());
        Pneu p2 = new Pneu(71);
        assertFalse(p2.precisaCalibrarPneus());
    }
}