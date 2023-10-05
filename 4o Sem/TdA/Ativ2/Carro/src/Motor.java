class Motor {
    private double cilindradas;
    private int potencia;

    private boolean isLigado = false;

    public Motor(double cilindradas, int potencia) {
        this.cilindradas = cilindradas;
        this.potencia = potencia;
    }


    public boolean ligarMotor() {
        if(!isLigado){
            isLigado = !isLigado;
            return true;
        } else {
            return false;
        }
    }

    public void desligarMotor() {
        System.out.println("Motor desligado.");
    }

    public void acelerar() {
        System.out.println("Motor acelerando.");
    }

    
    public double getCilindradas() {
        return cilindradas;
    }

    public int getPotencia() {
        return potencia;
    }
}