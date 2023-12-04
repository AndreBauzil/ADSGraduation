public class EncNumHardc {
    public static void main(String[] args) {
        // Criando matriz
        int numeroLinhas=10, numeroColunas=10;
        int[][] matriz = new int[numeroLinhas][numeroColunas];

        // Preenchendo matriz
        System.out.println("Matriz: ");
        for (int i = 0; i < numeroLinhas; i++) {
		    for (int j = 0; j < numeroColunas; j++) {
                int numAle = (int) (Math.random()*10);  // adquire um núm aleatório para preencher
                matriz[i][j] = numAle;
                System.out.print(numAle + " ");         // printa o núm selecioando
            }
            System.out.println();
        }
        
        // Procurar na matriz
        int numProc = 4; // número hardcore procurado na matriz
        int li = -1;
        int col = -1;

        for (int i = 0; i < numeroLinhas; i++) {
		    for (int j = 0; j < numeroColunas; j++) {
                if (matriz[i][j] == numProc) {
                    li = i;
                    col = j;
                }
            }
        }
        
        // Resultado
        if (li == -1 || col == -1) {
            System.out.println("\nO número " + numProc + " não foi encontrado na matriz.");
        } else {
            System.out.println("\nO número " + numProc + " foi encontrado na linha " + (li+1) + " e coluna " + (col+1) + ".");
        }
    }
}
