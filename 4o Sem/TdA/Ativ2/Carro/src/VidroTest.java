import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VidroTest {

    Vidro v = new Vidro(false);
    @Test
    void abrirVidros() {
        assertTrue(v.abrirVidros());
        assertFalse(v.abrirVidros());
    }

    @Test
    void fecharVidros() {
        assertFalse(v.fecharVidros());
        v.abrirVidros();
        assertTrue(v.fecharVidros());
    }
}