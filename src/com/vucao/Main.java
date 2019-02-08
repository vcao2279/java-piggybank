package com.vucao;

public class Main
{
    public static void main(String[] args)
    {
        PiggyBank piggyBank = new PiggyBank();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.println("***Transaction History***");
        piggyBank.getHistory();
        System.out.println("\n");

        System.out.println("***Piggybank's Contents***");
        piggyBank.getContents();
        System.out.println("\n");

        System.out.println("***Piggybank's Balance***");
        piggyBank.getValue();
        System.out.println("\n");
    }
}
