public class EncSoma {
    public static void main(String[] args) {
        // Decl Variáveis e Matriz
        int soma=0, numeroLinhas=3, numeroColunas=3;
        int[][] matriz = new int[numeroLinhas][numeroColunas];

        System.out.println("Matriz: ");

        // Laço que preenche matriz
        for (int i = 0; i < numeroLinhas; i++) {
		    for (int j = 0; j < numeroColunas; j++) {
                int numAle = (int) (Math.random()*10);  // Adquire um núm aleatório para preencher
                matriz[i][j] = numAle;
                soma+=matriz[i][j];
                System.out.print(numAle + " ");         // Printa o núm selecioando
            }
            System.out.println();
        }
        System.out.println("\nSoma: " + soma);          // Printa a soma dos elementos internos
    }
}