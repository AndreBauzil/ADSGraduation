import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        // Criando pilha, empilhando números de 1 a 10 e mostrando em um sysout
        Stack<Integer> pilha = new Stack<Integer>();
        for (int i = 1; i < 11; i++) {
            pilha.push(i);
        }
        System.out.println("Pilha atualizada: " + pilha);

        // Desempilhando e exibindo os números em um sysout
        while (!pilha.isEmpty()) {
            pilha.pop();
        }
        System.out.println("Pilha desempilhada: " + pilha);
    }
}