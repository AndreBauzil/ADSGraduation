public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("BMW", "M8 Competition", 4.4, 625, 1000, 9);

        meuCarro.girarChave();
        meuCarro.exibirPainelSimples();

        meuCarro.abastecer(100);
        meuCarro.girarChave();

        meuCarro.abrirJanela();
        meuCarro.ajustarBanco();
        meuCarro.ligarAcessorios();

        meuCarro.dirigir(100.0);

        meuCarro.exibirPainelSimples();


    }
}