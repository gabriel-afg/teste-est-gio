import java.util.Scanner;

public class Main
{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        // Verifica se o número pertence à sequência de Fibonacci
        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    // Método que verifica se um número pertence à sequência de Fibonacci
    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return a == n;
    }
}