import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {

    @Test
    void testAquecerBanco() {
        Banco b = new Banco();
        assertTrue(b.aquecerBanco());
    }
}