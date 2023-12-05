package test;

import main.Banco;
import main.Carro;
import main.Motor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MotorTest {
    private Carro carro;
    private Motor motor;
    private Banco banco;

    @BeforeEach
    void setUp() {
        carro = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
        banco = carro.getBanco();
        motor = carro.getMotor();
    }

    @Test
    void testLigarMotor() {
       assertTrue(motor.ligarMotor());
       assertFalse(motor.ligarMotor());
    }

    @Test
    void testAcelerar(){
        motor.ligarMotor();
        banco.colocarCinto();
        assertEquals("Acelerando", motor.acelerar());

        motor.desligarMotor();
        assertEquals("Ligue o motor", motor.acelerar());

        motor.ligarMotor();
        banco.tirarCinto();
        assertEquals("Bote o cinto", motor.acelerar());
    }
}