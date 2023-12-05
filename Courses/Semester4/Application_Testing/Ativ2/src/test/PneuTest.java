package test;

import main.Carro;
import main.Pneu;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PneuTest {
    private Carro carro;
    private Pneu pneu;
    private String mensagem;

    @BeforeEach
    public void setUp() {
        carro = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
        pneu = carro.getPneu();
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
        mensagem = pneu.girarPneus();
        assertEquals("Por favor coloque o cinto!", mensagem);
    }

    @Test
    void testGirarPneuComCinto() {
        carro.getBanco().colocarCinto();
        mensagem = pneu.girarPneus();
        assertEquals("Pneus girando.", mensagem);
    }
}
