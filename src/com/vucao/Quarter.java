package com.vucao;

public class Quarter implements Coin
{
    private static double VALUE = 0.25;
    private int amount;
    private String name;

    public Quarter()
    {
        name = "Quarter";
        amount=1;
    }

    public Quarter(int amount)
    {
        name = "Quarter";
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
