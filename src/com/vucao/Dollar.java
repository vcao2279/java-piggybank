package com.vucao;

public class Dollar implements Coin
{
    private static double VALUE = 1;
    private int amount;
    private String name;

    public Dollar()
    {
        name = "Dollar";
        amount=1;
    }

    public Dollar(int amount)
    {
        name = "Dollar";
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
