package org.example;

import org.example.StrategyPattern.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        double amount = 1000;

        PaymentManager manager = new PaymentManager();

        System.out.println("------ TERMINAL -------");

        do{
            System.out.println("Selecione o pagamento: \n\n1 -- PIX\n2 -- Boleto\n3 -- Cartão\n\n0 -- Sair\n");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    manager.setStrategy(new PixPayment(1000));
                    break;
                case 2:
                    manager.setStrategy(new BoletoPayment(2000));
                    break;
                case 3:
                    manager.setStrategy(new CreditCardPayment(3000));
                    break;
                default:
                    if(opcao != 0){
                        System.out.println("\nOpção incorreta\n");
                    }
                    manager = null;
                    break;
            }

            if(manager != null){
                manager.pagarValor(amount);
            }

        }while(opcao != 0);

        System.out.println("Bye bye :(");
    }
}