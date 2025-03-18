package org.example.StrategyPattern;


import java.util.Random;

public class PixPayment implements PaymentStrategy{

    private double amount;
    private int tamanhoCodigo;

    public PixPayment(double amount){
        this.amount = amount;
        this.tamanhoCodigo = 60;
    }

    private void generateString(Random rng, String characters)
    {
        char[] text = new char[tamanhoCodigo];
        for (int i = 0; i < tamanhoCodigo; i++)
        {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }

        System.out.println("\nCódigo do QR code:");
        System.out.println(text);
    }

    public void codigoPix(){
        Random rand = new Random();
        System.out.println("\nGerando código PIX...\nPagamento de R$" + amount);

        generateString(rand, "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890");
    }

    @Override
    public void processPayment(double amount){
        this.codigoPix();
    }


}
