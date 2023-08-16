package Banco;

/**
 * main
 */
public class main{
    public static void main(String[] args) {
        // Instanciando contas
        Conta comum = new Conta(1000.0);
        Conta endividado = new Conta(1000.0, 250.0);

        endividado.Saldar();
    }
}