package Ex4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta();

        // Ex 4
        System.out.println("\n---------- Ex 4 ----------");
        conta1.deposito(1000);
        System.out.println("Você possui o valor de: " + conta1.getSaldo() + "R$ na sua conta.");
        System.out.print("Digite o valor a ser retirado da conta: ");
        int valor = sc.nextInt();
        
        boolean retirada = conta1.retirada(valor);
        if (retirada) {
            System.out.println("Retirada realizada com sucesso. Novo saldo: " + conta1.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para realizar a retirada.");
        }
        
        sc.close();
    }
}
