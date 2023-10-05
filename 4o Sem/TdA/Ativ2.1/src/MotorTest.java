import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    @Test
    void testLigarMotor() {
       Motor m = new Motor(210 ,20000);

       assertTrue(m.ligarMotor());
       assertFalse(m.ligarMotor());
    }
}