import java.util.Scanner;

public class FilaBancoD {
    
    
    public static void main(String[] args) { 
 
        String[] nomesFila = new String[3]; 
        Scanner nome = new Scanner(System.in); 
    
    int i = 0;
    
    while (i<=2){
        nomesFila[i] = nome.next();
        System.out.println(nomesFila[i]+ " - esta na posicao: "+ (i+1));  
        i++;
    }
    nome.close();
    } 
}