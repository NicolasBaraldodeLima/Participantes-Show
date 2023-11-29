package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;


public class Exercitando {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos participantes há no show? Digite o número desejado.");
        int numeroParticipantes = scanner.nextInt();

        if (numeroParticipantes <= 0) {
            System.out.println("Número inválido. Por favor, insira um número positivo.");
        } else {
            for (int i = 1; i < numeroParticipantes; i++) {

                System.out.println("Participante #" + i);

            }
            System.out.println("Total de participantes " + numeroParticipantes);
        }

        scanner.close();


    }
}
