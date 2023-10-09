package main;
// public class Vidro extends Carro{
//     private boolean pelicula;
//     private boolean limpadorParabrisa;
//     private boolean limpadorLigado;



//     public boolean hasPelicula() {
//         return pelicula;
//     }
//     public boolean hasLimpadorParabrisa() {
//         return limpadorParabrisa;
//     }
//     public boolean isLimpadorLigado() {
//         return limpadorLigado;
//     }
//     public void ligarLimpador(){
//         limpadorLigado = !limpadorLigado;
//     }
// }

public class Vidro {

    private boolean isOpen;

    public Vidro(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean abrirVidros() {
       if(!isOpen) {
           System.out.println("Abrindo");
           this.isOpen = !isOpen;
           return true;
       } else return false;

    }

    public boolean fecharVidros() {
        if(isOpen) {
            System.out.println("Fechando");
            this.isOpen = !isOpen;
            return true;
        } else return false;
    }
}