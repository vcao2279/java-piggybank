package com.vucao;

public class Penny implements Coin
{
    private static double VALUE = 0.01;
    private int amount;
    private String name;

    public Penny()
    {
        name = "Penny";
        amount=1;
    }

    public Penny(int amount)
    {
        name = "Penny";
        this.amount = amount;
    }

    public double totalDeposit()
    {
        return VALUE*amount;
    }

    public String getName(){
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
