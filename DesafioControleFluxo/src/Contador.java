import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int parametroUm = teclado.nextInt();
        int parametroDois = teclado.nextInt();

        try{
           contar(parametroUm, parametroDois); 
        }
        catch(ParametrosInvalidosException e){
            System.err.println("Por regras de negócios o parametro um NÃO PODE ser maior do que o parametro dois.");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        System.out.println(contagem);
    }
}
