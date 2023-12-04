package test;

import main.Carro;
import main.Painel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class PainelTest {
    private Carro carro;
    private Painel painel;

    @BeforeEach
    void setUp() {
        carro = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
        painel = carro.getPainel();
    }


    @Test
    void painelAvançado() {
        carro.ligar();

        assertDoesNotThrow(() -> {
            painel.painelAvançado();
        });

        assertEquals("Painel Avançado", painel.painelAvançado());
    }
}