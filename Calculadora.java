import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora!");
        System.out.println("========================");

        // Número 1
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        // Operador
        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        // Número 2
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        double resultado = 0;

        // Calculadora
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    resultado = num1 / num2;
                else
                    System.out.println("Não é possível dividir por zero!");
                break;
            default:
                System.out.println("Operador inválido!");
        }

        if (operador != '/') {
            System.out.println("========================");
            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}
