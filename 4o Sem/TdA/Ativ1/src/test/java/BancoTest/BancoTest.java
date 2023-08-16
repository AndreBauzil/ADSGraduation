package BancoTest;

import Numeros.Numeros;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class NumerosTest {
    private Numeros x;
    
    public NumerosTest() {
        x = new Numeros();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
   @Test
    public void testNumPar() {
        assertEquals(true, x.numPar(8));
    }

   @Test
    public void testAreaQuad() {
        assertEquals(100, x.areaQuad(10));
    }
    
    @Test
    public void testNumDiv(){
        assertTrue(x.numDiv(10,2));
    }
}
