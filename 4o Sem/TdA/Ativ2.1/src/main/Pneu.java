package main;
// public class Pneu {
//     private String tipo;
//     private double calibragem1;
//     private double calibragem2;
//     private double calibragem3;
//     private double calibragem4;
//     public Pneu(String tipo, double calibragem1, double calibragem2, double calibragem3, double calibragem4) {
//         this.tipo = tipo;
//         this.calibragem1 = calibragem1;
//         this.calibragem2 = calibragem2;
//         this.calibragem3 = calibragem3;
//         this.calibragem4 = calibragem4;
//     }

//     public String getTipo() {
//         return tipo;
//     }
//     public String getCalibragem() {
//         return "Nível pneu 1 :"+calibragem1+"\nNível pneu 2 :"+calibragem1+"\nNível pneu 3 :"+calibragem3+"\nNível pneu 4 :"+calibragem4;
//     }
// }


public class Pneu {
    private double calibragem;

    public Pneu(double calibragem) {
        this.calibragem = calibragem;
    }

    public String girarPneus(Banco banco) {
        if (banco.isSafe() == true) {
            return "Pneus girando.";
        } else {
            return "Por favor coloque o cinto!";
        }
    }

    public boolean precisaCalibrarPneus() {
        if(calibragem > 70){
            return false;
        } else {
            return true;
        }
    }
}