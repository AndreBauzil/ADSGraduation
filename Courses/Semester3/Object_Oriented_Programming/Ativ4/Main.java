import java.util.*;

/**
 * Andre G. Bauzil
 */
public class Main {
    public static void main(String[] args) {
        // Ex1
        System.out.println("----------- Ex1 -----------");
        // Criando a lista e adicionando elementos
        ArrayList<Integer> lista1 = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int numAle = (int) (Math.random()*10);   // Numero aleatório
            lista1.add(numAle);
        }

        // Imprimindo os elementos
        int num=1;
        for (Integer numL : lista1) {
            System.out.print(num + "º Numéro: " + numL + "\n");
            num++;
        }


        // Ex2
        System.out.println("\n----------- Ex2 -----------");
        // Criando a lista e adicionando elementos
        ArrayList<String> lista2 = new ArrayList<String>();
        
        lista2.add("Andre");
        lista2.add("Guedez");
        lista2.add("Bauzil");
        System.out.println("Lista inicial: " + lista2);
        
        // Removendo o 2º elemento
        lista2.remove(1);
        System.out.println("Lista agora: " + lista2);
        
        
        // Ex3
        System.out.println("\n----------- Ex3 -----------");
        // Criando as pessoas e alimentando os dados
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        
        pessoa1.setNome("Andre Bauzil");
        pessoa1.setIdade(19);
        pessoa2.setNome("João da Silva");
        pessoa2.setIdade(25);
        pessoa3.setNome("Alexandre Telechi");
        pessoa3.setIdade(30);
        
        // Criando a lista e adicionando elementos
        ArrayList<Pessoa> lista3 = new ArrayList<Pessoa>();
        lista3.add(pessoa1);
        lista3.add(pessoa2);
        lista3.add(pessoa3);
        
        // Imprimindo os dados
        for (int i = 0; i < lista3.size(); i++) {
            System.out.println((i+1) + "ª pessoa: " + lista3.get(i).getNome() + " - " + lista3.get(i).getIdade());
        }
        
        
        // Ex4
        System.out.println("\n----------- Ex4 -----------");
        // Criando a lista e adicionando elementos
        ArrayList<Pessoa> lista4 = new ArrayList<Pessoa>();
        lista4.add(pessoa1);
        lista4.add(pessoa2);
        lista4.add(pessoa3);
        
        // Somando as idades e imprimindo 
        int cont=0;
        for (int i = 0; i < lista4.size(); i++) {
            cont+=lista4.get(i).getIdade();
        }
        System.out.println("A soma das idades na lista é: " + cont);
        
        
        // Ex5
        System.out.println("\n----------- Ex5 -----------");
        // Criando a lista e var do scanner
        ArrayList<Pessoa> lista5 = new ArrayList<Pessoa>();
        Scanner sc = new Scanner(System.in);

        while (true) {   // While para adicionar pessoas
            Pessoa pessoa = new Pessoa();

            System.out.print("Digite o nome da pessoa: ");
            pessoa.setNome(new Scanner(System.in).nextLine());   // Utilizei a sintaxe inteira em vez da variável pois a primeira execução
            System.out.print("Digite a idade da pessoa: ");    // da lista não estava "comendo" a quebra de linha, porém as outras repetições estavam 
            pessoa.setIdade(sc.nextInt());

            lista5.add(pessoa);
            if (pessoa.getIdade() == 3) break;  // enquanto a idade for diferente de 3
        }
        
        // For "normal" -
        // Nele podemos percorrer a lista utilizando a variável 'i', que é responsável por fazer
        // a repetição do laço, apenas damos um .get com essa variável e teremos cada objeto da lista desejada,
        // com isso, podemos chamar os métodos de cada objeto e teremos as infor. que precisamos.
        System.out.println("\nLista 5 - Fori");
        for (int i = 0; i < lista5.size(); i++) {
            System.out.println("Nome: " + lista5.get(i).getNome() + ", Idade: " + lista5.get(i).getIdade());
        }

        // For comprimido (each) -
        // Já no foreach não precisamos fazer o .get pois cada elemento do for já é um objeto da nossa lista,
        // com isso, apenas precisamos chamar os métodos de cada objeto(pessoa), sem a necessidade de ter que "achar" cada um deles.
        System.out.println("\nLista 5 - Foreach");
        for (Pessoa pessoa : lista5) {
            System.out.println("Nome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
        }

        sc.close();
    }
}