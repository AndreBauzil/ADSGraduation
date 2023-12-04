import javax.swing.*;

public class Metodos {
    public static void cadastrarCachorro() {
        // Abre um JOption para cada atributo de cachorro
        String nome = JOptionPane.showInputDialog("Informe o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:"));
        String corPelo = JOptionPane.showInputDialog("Informe a cor do pelo:");
    
        // Instancia e adiciona
        Cachorro cachorro = new Cachorro(nome, idade, corPelo);
        cachorro.setId(Cadastro.contID);
        Cadastro.cachorros.add(cachorro);
        
        // Aumenta o ID
        Cadastro.contID++;

        // Atualiza os textframes 
        attTextField();
    }

    public static void excluirCachorro() {
        // Abre um JOption perguntando qual o id que será excluido
        String inp = JOptionPane.showInputDialog(null, "Digite o ID do cachorro a ser excluído:");
        int id = Integer.parseInt(inp);

        // Define o objeto que será excluido
        Cachorro caExcluido = null;

        // For Each para procurar o cachorro que possui o id especificado
        for (Cachorro cach : Cadastro.cachorros) {
            if (cach.getId() == id) {
                caExcluido = cach;
                break;
            }
        }

        // If cachorro que será excluído não for null, remove e atualiza
        if (caExcluido != null) {
            Cadastro.cachorros.remove(caExcluido);
            attTextField();
        } else {    // else mostra que não foi encontrado
            JOptionPane.showMessageDialog(null, "Cachorro não encontrado!");
        }
    }

    public static void alterarCachorro() {
        // Abre um JOption perguntando qual o id que será alterado
        String input = JOptionPane.showInputDialog(null, "Informe o ID do cachorro a ser alterado:");
        int id = Integer.parseInt(input);

        // For Each para procurar o cachorro que possui o id especificado
        Cachorro caAlterar = null;
        for (Cachorro cachorro : Cadastro.cachorros) {
            if (cachorro.getId() == id) {
                caAlterar = cachorro;
                break;
            }
        }

        // If cachorro que será alterado não for null, pergunta quais os novos atributos e atualiza
        if (caAlterar != null) {
            // Pergunta quais atributos novos
            String novoNome = JOptionPane.showInputDialog(null, "Novo nome:");
            int novaIdade = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova idade:"));

            // Seta novos atributos
            caAlterar.setNome(novoNome);
            caAlterar.setIdade(novaIdade);

            // Atualiza lista
            attTextField();
        } else {    // else mostra que não foi encontrado
            JOptionPane.showMessageDialog(null, "Cachorro não encontrado!");
        }
    }

    public static void attTextField() {
        String message = "";
        // Adiciona na mensagem os cachorros que serão mostrados na lista
        for (Cachorro cach : Cadastro.cachorros) {
            message += "ID: "+cach.getId()+"\n"
            +"Nome: "+cach.getNome()+"\n"
            +"Idade: "+cach.getIdade()+"\n"
            +"Cor do Pelo: "+cach.getCorPelo()+"\n\n";
        }
        Cadastro.tarRegistros.setText(message);
    }
}