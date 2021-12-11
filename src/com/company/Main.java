package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000
                );

        while (true) try{
            bankAccount.withDraw(6000);
        }catch (LimitException limitException){
            System.out.println(limitException.getMessage());
            try {
                bankAccount.withDraw(limitException.getRemainingAmount());
            } catch (LimitException e) {
                e.printStackTrace();
            }
            break;
        }

        }
    }

