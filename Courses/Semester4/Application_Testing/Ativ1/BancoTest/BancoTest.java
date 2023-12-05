package BancoTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BancoTest {
    @Test
    public void testSaldar() {
        Conta comum = new Conta(1000.0);
        Conta endividado = new Conta(1000.0, 250.0);
        
        assertEquals("Dívida saldada", comum.Saldar());
        assertEquals("Saldo insuficiente", endividado.Saldar());
    }
    
    @Test
    public void testSacar() {
        Conta conta = new Conta(1000.0);
        
        conta.Sacar(200.0);
        assertEquals(800.0, conta.exibirSaldo());
        
        conta.Sacar(1000.0);
        assertEquals(800.0, conta.exibirSaldo());
    }
    
    @Test
    public void testDepositar() {
        Conta conta = new Conta(1000.0);
        
        conta.Depositar(300.0);
        assertEquals(1300.0, conta.exibirSaldo());
    }
    
    @Test
    public void testTransferPara() {
        Conta origem = new Conta(1000.0);
        Conta destino = new Conta(500.0);
        
        origem.transferPara(destino, 600.0);
        assertEquals(1000.0, origem.exibirSaldo());
        assertEquals(500.0, destino.exibirSaldo());
        
        origem.transferPara(destino, 400.0);
        assertEquals(600.0, origem.exibirSaldo());
        assertEquals(900.0, destino.exibirSaldo());
    }
}
