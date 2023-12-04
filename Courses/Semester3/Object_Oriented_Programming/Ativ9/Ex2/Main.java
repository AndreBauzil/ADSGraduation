package Ex2;  // Outro pacote criado
import java.util.*;

import Classes.*;  // Import para aproveitar o sistema de classes já existente

/*
*
*  O polimorfismo está na utilização das classes.
*  Dentro do loop for, a variável pessoa é inicializada com um objeto da classe correspondente a um valor através do switch. Em cada repetição do loop, um objeto diferente é criado
*  (um Gerente, um Programador ou um Vendedor) e a referência a pessoa é usada para ter acesso aos métodos comuns das subclasses, como getNome(), getIdade(), etc.
*  Desse jeito, permite tratar os objetos de diferentes classes de forma unificada, simplificando o código e evitando repetições desnecessárias. 
*  Além disso, seria possível adicionar novas subclasses de Pessoa sem precisar modificar a lógica do loop for, aproveitando a flexibilidade do polimorfismo.
* 
*/

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {   // For para criar 1000 objetos

            int ran = (int) new Random().nextInt(3);  // Randomiza o switch
            double salario = new Random().nextDouble()*20000;  // Randomiza o salário até 20.000

            Pessoa pessoa = null;  // Declaração var pessoa

            switch (ran) {   // Switch para criar e randomizar objetos
                case 0:
                    pessoa = new Gerente("Paulo", 45, "Av. Rodrigo Alves", salario);
                    break;
                    
                case 1:
                    pessoa = new Programador("Rodrigo", 32, "R. Lobo da Costa", salario);
                    break;
                
                case 2:
                    pessoa = new Vendedor("Flavio", 28, "R. Maroto Felipe", salario);
                    break;
            }
                
            System.out.println(   // Printa os 1000 registros do objeto pessoa criados
                i + ": Nome: "+pessoa.getNome()
                +", Idade: "+pessoa.getIdade()
                +", Endereço: "+pessoa.getEndereco()
                +", Salário Base: "+String.format("%.2f",pessoa.getSalario())
                +", Salário: "+String.format("%.2f",pessoa.calculaSalario())
            );  
        }
    }
}
