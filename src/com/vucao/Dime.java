package com.vucao;

public class Dime implements Coin
{
    private static double VALUE = 0.10;
    private int amount;
    private String name;

    public Dime()
    {
        name = "Dime";
        amount=1;
    }

    public Dime(int amount)
    {
        name = "Dime";
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
