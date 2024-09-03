/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        // Chama o método que conta as ocorrências da letra 'a' na string
        int count = countLetterA(input);

        // Verifica se a letra 'a' foi encontrada e imprime a mensagem correspondente
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não foi encontrada na string.");
        }

        scanner.close();
    }

    // Método que conta as ocorrências da letra 'a' (maiúscula ou minúscula) em uma string
    public static int countLetterA(String str) {
        int count = 0;
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        return count;
    }
}