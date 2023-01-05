// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class MediaIdadeDf {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int soma =0;
        double media = 0;
        
        // recebe a 1º idade
        System.out.println("Digite a 1ª Idade:");
        int idade1 = leitor.nextInt();
        soma += idade1;
                        
        // recebe a 2º idade
        System.out.println("Digite a 2ª Idade:");
        int idade2 = leitor.nextInt();
        soma += idade2;
          
           
        // recebe a 3º idade
        System.out.println("Digite a 3ª Idade:");
        int idade3 = leitor.nextInt();
        soma += idade3;
         
                                  
        // calcula a média das idades
        //soma = idade1 + idade2 + idade3;
        media = soma / 3;
            
            
        if ((media>=0)&&(media<=25)){
        System.out.println("Jovem!");
        } else if ((media>=26)&&(media<=60)) {
        System.out.println("Adulta!");
        } else if (media>60) {
        System.out.println("Idosa!");
        }
            
        leitor.close();
    }
    
}
