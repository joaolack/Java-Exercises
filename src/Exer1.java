import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {

        // Exercício 1
        Scanner scanner = new Scanner(System.in);

        int[] temp = new int[10];
        boolean alerta = false;

        for (int i = 0; i < temp.length; i++) {
            System.out.println("Digite uma temperatura (em Celsius): ");
            temp[i] = scanner.nextInt();
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 50 || temp[i] > 50) {
                System.out.println("Alerta! Temperatura crítica de " + temp[i] + " graus Celsius detectada na medição " + (i + 1));
                alerta = true;
                break;
            }
        }
        if (!alerta){ //se o alerta for falso, exibe a mensagem.
            System.out.println("Nenhuma temperatura crítica encontrada.");
        }
    }
}


