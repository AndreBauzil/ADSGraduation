package Ex3;
import java.util.*;

/*
 * Assim como no exercício anterior, o polimorfismo se encontra nas classes.
 * Dentro do for criamos a classe Conta, porém, com o switch escolhemos se essa conta vai ser Poupança ou Corrente
 * com isso, depois de criado, podemos referencia-las apenas utilizando a classe Conta sem a necessidade de especificar
 * qual tipo de conta ela é, podendo mostrar os dados de todos os cliente sem precisar criar um código complexo e repetitivo.
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {   // For para criar 1000 objetos

            int ran = (int) new Random().nextInt(2);  // Randomiza o switch
            double saldo = new Random().nextDouble()*1000;  // Randomiza o salário até 1.000

            Conta conta = null;  // Declaração var conta


            switch (ran) {   // Switch para criar e randomizar objetos
                case 0:
                    conta = new Poupança("Mariza", 31, "R. Bento Ribeiro - 241", saldo);
                    break;
                    
                case 1:
                    conta = new Corrente("Flavio", 28, "R. Maroto Felipe - 432", saldo);
                    break;
            }
                
            System.out.println(   // Printa os 1000 registros do objeto conta criados
                i + ") Tipo de conta: Conta "+conta.tipo()
                +", Nome: "+conta.getNome()
                +", Idade: "+conta.getIdade()
                +", Endereço: "+conta.getEndereco()
                +", Saldo base: "+String.format("%.2f",conta.getSaldo())
                +", Saldo Final: "+String.format("%.2f",conta.calculaOperacao())
            );  
        }
    }
}