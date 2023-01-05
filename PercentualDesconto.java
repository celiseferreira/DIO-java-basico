import java.util.*;

public class PercentualDesconto {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

    int M = input.nextInt();
    int D = input.nextInt();  

    double diferenca = M-D;
    double desconto = diferenca/M;
    double porcentagem = desconto*100;

    System.out.println("O desconto foi de "+(int)porcentagem+"%");

    input.close();
    }
}