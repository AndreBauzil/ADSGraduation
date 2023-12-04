import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        ContaCorrente conta1 = new ContaCorrente();
        
        // Ex 1
        System.out.println("---------- Ex 1 ----------");
        System.out.print("Digite a idade desejada: ");
        System.out.println(pessoa1.setIdade(sc.nextInt()));
        sc.nextLine();

        // Ex 2
        System.out.println("\n---------- Ex 2 ----------");
        while (true) {
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            if (!pessoa1.setNome(nome)) {         // se o nome estiver vazio, repete
                System.out.println("Nome inválido. Digite novamente.");
                continue;
            }
            break;
        }
        System.out.println("Nome: " + pessoa1.getNome());


        // Ex 3
        System.out.println("\n---------- Ex 3 ----------");
        conta1.deposito(1000);
        System.out.println("Você possui o valor de: " + conta1.getSaldo() + "R$ na sua conta.");
        System.out.println("Digite o valor do saque: "); 
        System.out.println(conta1.retirada(sc.nextInt()));
        System.out.println("Digite o valor do saque: "); 
        System.out.println(conta1.retirada(sc.nextInt()));
        
        // Ex 4

        sc.close();
    }
}
