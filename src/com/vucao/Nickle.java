package com.vucao;

public class Nickle implements Coin
{
    private static double VALUE = 0.05;
    private int amount;
    private String name;

    public Nickle()
    {
        name = "Nickle";
        amount=1;
    }

    public Nickle(int amount)
    {
        name = "Nickle";
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
