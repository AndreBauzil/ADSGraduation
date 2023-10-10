package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.Carro;
import main.Pneu;

class PneuTest {
    private Carro carro;
    private String mensagem;

    @BeforeEach
    public void setUp() {
        carro = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
    }

    @Test
    void testPrecisaCalibrarPneus() {
        Pneu p1 = new Pneu(70);
        assertTrue(p1.precisaCalibrarPneus());

        Pneu p2 = new Pneu(71);
        assertFalse(p2.precisaCalibrarPneus());
    }

    @Test
    void testGirarPneuSemCinto() {
        mensagem = carro.getPneu().girarPneus(carro.getBanco());
        assertEquals("Por favor coloque o cinto!", mensagem);
    }

    @Test
    void testGirarPneuComCinto() {
        carro.getBanco().colocarCinto();
        mensagem = carro.getPneu().girarPneus(carro.getBanco());
        assertEquals("Pneus girando.", mensagem);
    }
}
