/*
 * Utilizando a classe scanner
 */
package entradadedadosjava;

import java.util.Scanner; // classe Scanner importada de java.util

/**
 *
 * @author fabinho
 */
public class EntradaDeDadosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // entrada de dados
    
        System.out.print("Digite seu nome: ");
        
    String nome = entrada.nextLine(); //variavel nome recebendo os dados de entreda.
    
        System.out.print("Digite sua idade: ");
        
    short idade = entrada.nextShort();
    
        System.out.printf("Meu nome é %s e tenho %s anos", nome, idade);
        
        // teste de conversão das variaveis
        
        int valor = 30;
        String valorTxt = Integer.toString(valor); // conversão de int para String
        System.out.println(valorTxt);
        
        String valorNum = "40";
        int txtValor = Integer.parseInt(valorNum); // conversão de String para int
        System.out.println(txtValor);
        
        
        
        
    }
    
}
