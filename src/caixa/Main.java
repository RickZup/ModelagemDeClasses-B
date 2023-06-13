package caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Caixa mercardoMartins = new Caixa();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos lançamentos deseja fazer?");
        int lancamentos = entrada.nextInt();

        for (int i = 0; i < lancamentos; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Esse lançamento é de crédito ou débito?");
            System.out.println("Digite 1 para crédito ou 2 para débito:");
            int resposta = entrada.nextInt();

            if (resposta == 1){
                System.out.println("----------------------");
                System.out.println("Qual valor de entrada?");
                double valorDeEntrada = entrada.nextDouble();
                mercardoMartins.credito(valorDeEntrada);
            } else if (resposta == 2) {
                System.out.println("----------------------");
                System.out.println("Qual valor de saída?");
                double valorDeSaida = entrada.nextDouble();
                mercardoMartins.debito(valorDeSaida);
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("Saldo final do caixa é de: %.2f", mercardoMartins.saldo);

    }
}
