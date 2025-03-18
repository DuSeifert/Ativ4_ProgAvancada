package org.example.StrategyPattern;

public class PaymentManager {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pagarValor(double amount) {
        this.strategy.processPayment(amount);
    }
}
