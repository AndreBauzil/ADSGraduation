class Motor {
    private double cilindradas;
    private int potencia;

    public Motor(double cilindradas, int potencia) {
        this.cilindradas = cilindradas;
        this.potencia = potencia;
    }


    public void ligarMotor() {
        System.out.println("Motor ligado.");
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