package test;
import org.junit.jupiter.api.Test;

import main.Carro;
import main.Motor;
import main.Painel;

import static org.junit.jupiter.api.Assertions.*;

class PainelTest {


    @Test
    void painelAvançado() {
        Motor m = new Motor(210 ,20000);
        Carro c = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
        Painel p = new Painel(c, m);

        assertDoesNotThrow(() -> {
            p.painelAvançado();
        });

        assertEquals("Painel Avançado", p.painelAvançado());
    }
}