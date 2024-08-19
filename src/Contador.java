import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametro1 = scanner.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
            int parametro2 = scanner.nextInt();

            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = parametro2 - parametro1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Contador: " + i);
        }
    }
}