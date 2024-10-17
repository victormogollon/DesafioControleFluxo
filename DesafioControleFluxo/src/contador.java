import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int param1, param2;

        System.out.println("Digite o primeiro parâmetro: ");
        param1 = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        param2 = terminal.nextInt();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        int dif = 0;
        
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }else{
                 dif = parametro2 - parametro1;
        }
        for (int i = 1; i <= dif; i++) {
            System.out.println(i);
        }
    }
}


