package main;
public class Painel {
    private Carro carro;
    private Motor motor;
    
    public Painel(Carro carro, Motor motor) {
        this.carro = carro;
        this.motor = motor;
    }

    public void mostrarInformacoes(String tipo){
        if(tipo.equals("simples")){
            painelSimples();
        } else {
            painelAvançado();
        }
    }

    public void painelSimples() {
        System.out.print(
            "-------- Painel Simples -------- " 
            + "\n Informações do carro:" 
            + "\n - Quilometragem: " + carro.getKm()
            // + "\n - " 
            + "\n - Combustível: " + carro.getNivelTanque() 
            + "\n - Nível do tanque: " + carro.getNivelCombustivel() + "% cheio\n"
        );
    }

    public String painelAvançado() {
        System.out.print(
            "-------- Painel Avançado --------"
            + "\n* Informações do carro:"
            + "\n   Marca: " + carro.getMarca()
            + "\n   Modelo: " + carro.getModelo()
            + "\n* Motor:"
            + "\n   Cilindradas do motor - " + motor.getCilindradas()
            + "\n   Potência do motor - " + motor.getPotencia() + " cavalos"
            + "\n* Gasolina:"
            + "\n  - Quilometros por litro: " + carro.getKmPorLitro() + "L "
            + "\n  - Capacidade do tanque: " + carro.getTanque() + " litros\n\n"
        );

        return "Painel Avançado";
    }
}