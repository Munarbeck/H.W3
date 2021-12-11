package com.company;

public class BankAccount {
    private double amount;


    public double getamount() {
        return amount;
    }

    public void setamount(double amount) {
        amount = amount;
    }
    public void deposit(double sum){
       amount +=sum;
        System.out.println("Вы пополнили счет" + sum);

    }public void withDraw(double sum) throws LimitException{
        if (sum > amount){
            throw new LimitException("Запрашиваемая сумма больше чем вашего балланса" , amount);

        }else {
            amount -= sum;
            System.out.println("Вы сняли с вашего счета :" + sum + "Ostatok" + amount);
        }

    }

}
