package test;

import main.Banco;
import main.Carro;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class CarroTest {
    private Banco banco;
    private Carro carro;
    
    @BeforeEach
    void setUp() {
        carro = new Carro("RENAULT", "CLIO", 100, 200, 100, 12);
        banco = carro.getBanco();
    }
    
    @Test
    void testCarro() {
        assertNotNull(carro);
    }

    @Test
    void testGetTanque(){
        assertEquals(100, carro.getTanque());
    }

    @Test
    void testGirarChave(){
        banco.colocarCinto(); //isSafe = true
        carro.abastecer(100);

        assertEquals("Ligado", carro.girarChave());

        banco.tirarCinto(); //retira o cinto, isSafe = false;
        assertEquals("Coloque o cinto", carro.girarChave());

        banco.colocarCinto();
        assertEquals("Desligado", carro.girarChave()); //Desligado
    }
}