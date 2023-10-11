package test;

import main.Vidro;
import main.Carro;
import main.Motor;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VidroTest {
    private Vidro vidro;
    private Motor motor;
    private Carro carro;

    @BeforeEach
    void setUp() {
        carro = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
        motor = carro.getMotor();
        vidro = carro.getVidro();
    }

    @Test
    void testAbrirVidrosComMotorLigado() {
        motor.ligarMotor();
        assertTrue(vidro.abrirVidros());
        vidro.fecharVidros();
    }

    @Test
    void testAbrirVidrosComMotorDesligado() {
        motor.desligarMotor();
        assertFalse(vidro.abrirVidros());
    }

    @Test
    void testFecharVidros() {
        motor.ligarMotor();
        vidro.abrirVidros();
        assertTrue(vidro.fecharVidros());
    }
}
