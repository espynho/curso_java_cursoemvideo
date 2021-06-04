/*
 * Tipos de variaveis
 */
package tiposprimitivosjava;

/**
 *
 * @author fabinho
 */
public class TiposPrimitivosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tipo inteiro numeros inteiros
        int idade = 3; // tipo inteiro normal
        int idade0 = (int) 3; // tipo typecast
        Integer idade1 = new Integer(3); // usando classe Wrapper Class
        
        // tipo flutuante numeros reais
        float salario = 10.000f;
        float salario0 = (float) 10.000;
        Float salario1 = new Float(10.000);
        
        // tipo caracter somente 1 letra
        char sexo = 'm';
        char sexo0 = (char) 'm';
        Character sexo1 = new Character ('m');
        
        // tipo booleano
        boolean casado = false;
        boolean solteiro = (boolean) true;
        Boolean feliz = new Boolean(true);
        
        // comandos de saida
        System.out.print("O salario é: " + salario); // sem quebra de linha
        
        System.out.println("O salario é: " + salario0); // com quebra de linha
        
        System.out.printf("O salario é %.3f", salario1); // formatado % mascara a variavel
        
        System.out.printf("O salario é %.3f \n", salario); // formatado com \n quebra de linha
        
        String nome = "Afonso"; // variavel da classe String
        
        System.out.printf("O salario de %s é %.2f", nome, salario1); // formatado com 2 variaveis
        
        System.out.format("O salario de %s é %.2f", nome, salario); // formatado com format <> print
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
