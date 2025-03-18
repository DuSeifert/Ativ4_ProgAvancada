package org.example.StrategyPattern;

import java.util.Arrays;
import java.util.Random;

public class BoletoPayment implements PaymentStrategy{

    private double amount;

    public BoletoPayment(double amount){
        this.amount = amount;
    }

    public void pagarBoleto(){
        System.out.println("\nGerando o código do boleto...\nPagamento de R$" + amount);

        Random rand = new Random();
        int tam = 24;
        char[] text = new char[tam];

        for(int i = 0; i < tam; i++){
            text[i] = "1234567890".charAt(rand.nextInt(10));
        }

        System.out.println("\nNúmero do boleto:");
        System.out.println(text);
    }

    @Override
    public void processPayment(double amount){
        this.pagarBoleto();
    }



}
