package test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Acessorios;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AcessoriosTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testLigar() {
        Acessorios acessorios = new Acessorios();
        acessorios.ligar();

        // Captura a saída do console
        String consoleOutput = outputStream.toString().trim();

        // Verifica se a saída coincide com a mensagem esperada
        assertEquals("Acessorios ligados.", consoleOutput);
    }

    @Test
    public void testDesligar() {
        Acessorios acessorios = new Acessorios();
        acessorios.desligar();

        // Captura a saída do console
        String consoleOutput = outputStream.toString().trim();

        // Verifica se a saída coincide com a mensagem esperada
        assertNotEquals("Acessorios ligados.", consoleOutput);
    }
}
