package test;

import main.Acessorios;
import main.Carro;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AcessoriosTest {
    private Carro carro;
    private Acessorios acessorios;

    @BeforeEach
    void setUp() {
        carro = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
        acessorios = carro.getAcessorios();
    }

    @Test
    void testLigar() {
        carro.ligar();
        assertEquals("Acessórios ligados", acessorios.ligar());

        carro.desligar();
        assertEquals("Ligue o carro.", acessorios.ligar());
    }

    @Test
    void testDesligar() {
        assertNotEquals("Acessorios ligados.", acessorios.desligar());
    }
}