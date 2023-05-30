public class Metodos {
    private void cadastrarCachorro() {
        // Abre um JOption para cada atributo de cachorro, instancia e adiciona
        String nome = JOptionPane.showInputDialog("Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        long corPelo = Long.parseLong(JOptionPane.showInputDialog("Digite o corPelo:"));
    
        Cachorro cachorro = new Cachorro(nome, idade, corPelo);
    
        lista.add(cachorro);
    }

    private void excluirCachorro() {
        // Abre um JOption para cada atributo de cachorro, instancia e adiciona
        String inp = JOptionPane.showInputDialog(this, "Digite o ID do cachorro a ser excluído:");
        int id = Integer.parseInt(inp);

        Cachorro caExcluido = null;

        for (Cachorro cach : cachorros) {
            if (cach.getId() == id) {
                caExcluido = cachorro;
                break;
            }
        }

        if (caExcluido != null) {
            cachorros.remove(caExcluido);
            attTextField();
        }

        lista.add(cachorro);
    }
}