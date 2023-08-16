
public class Main {
    public static void main(String[] args) {
        // Instanciando contas
        Conta comum = new Conta(1000.0);
        Conta endividado = new Conta(1000.0, 250.0);

        comum.transferPara(endividado, 250);
        endividado.Saldar();
        endividado.exibirSaldo();
        comum.Sacar(100);
        comum.Depositar(350);

    }
}
