package test;
import org.junit.jupiter.api.Test;

import main.Carro;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void testCarro() {
        Carro x = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);

        assertNotNull(x);
    }

    @Test
    void testGetTanque(){
        Carro x = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);

        assertEquals(100, x.getTanque());
    }
}