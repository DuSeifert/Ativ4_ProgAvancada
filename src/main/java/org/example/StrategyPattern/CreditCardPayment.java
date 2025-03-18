package org.example.StrategyPattern;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{

    private int cartao;
    private double amount;

    public CreditCardPayment(double amount){
        this.cartao = 0;
        this.amount = amount;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public void pagarCartaoCredito(){

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEntre o número do cartão: ");
        int cartao = sc.nextInt();
        sc.nextLine();

        setCartao(cartao);

        System.out.println("\nPagamento de R$" + amount + " no cartão " + cartao + " completo");
    }

    @Override
    public void processPayment(double amount){
        this.pagarCartaoCredito();
    }


}
