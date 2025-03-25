import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[8];
        int soma = 0;
        boolean zero = false;

        for (int i = 0; i < num.length; i++){
            System.out.println("O " + (i+1) + " numero é: ");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < num.length; i++){
            soma += num[i];
            if (num[i] == 0){
                zero = true;
                System.out.println("Soma parcial: " + soma + ". Zero encontrado na posição " + (i+1));
                break;
            }
        }
        if (!zero){
            System.out.println("Soma total: " + soma);
        }
    }
}
