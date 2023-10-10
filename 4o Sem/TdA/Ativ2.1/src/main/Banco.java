package main;
// public class Banco extends Carro {
//     private boolean Reclinável;
//     private boolean Aquecedor;
//     private boolean aquecedorLigado;
//     public boolean hasAquecedor() {
//         return Aquecedor;
//     }

//     public boolean ativarAquecedor(){
//         this.aquecedorLigado = true;
//         return aquecedorLigado;
//     }
//     public boolean isReclinável() {
//         return Reclinável;
//     }
// }

public class Banco {
    boolean cinto = false; 

    public boolean isSafe() {
        if (cinto) {
            return true;
        } else {
            return false;
        }
    }

    public void colocarCinto() {
        cinto = true;
    }
    public void tirarCinto() {
        cinto = false;
    }


    public void ajustarPosicao() {
        System.out.println("Banco ajustado.");
    }

    public boolean aquecerBanco() {
        System.out.println("Banco aquecido.");
        return true;
    }
}