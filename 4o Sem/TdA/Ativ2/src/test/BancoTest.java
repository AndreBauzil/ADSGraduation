package test;

import main.Banco;
import main.Carro;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class BancoTest {
    private Banco banco;
    private Carro carro;
    
    @BeforeEach
    void setUp() {
        carro = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
        banco = carro.getBanco();
    }

    @Test
    void testAquecerBancoCarroDesligado() {
        assertFalse(banco.aquecerBanco());
    }
    
    @Test
    void testAquecerBancoCarroLigado() {
        carro.ligar();
        assertTrue(banco.aquecerBanco());
    }
}