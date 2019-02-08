package com.vucao;

import java.util.ArrayList;

public class PiggyBank
{
    private int totalPenny;
    private int totalNickle;
    private int totalDime;
    private int totalQuarter;
    private int totalDollar;
    private double totalValue;
    private ArrayList<Coin> coinArrayList= new ArrayList<>();

    public PiggyBank() {
        totalPenny = 0;
        totalNickle = 0;
        totalDime = 0;
        totalQuarter = 0;
        totalDollar = 0;
        totalValue = 0.0;
    }

    public void add(Coin coin){
        if (coin.getName() == "Penny") {
            totalPenny += coin.getAmount();
        } else if (coin.getName() == "Nickle") {
            totalNickle += coin.getAmount();
        } else if (coin.getName() == "Dime") {
            totalDime += coin.getAmount();
        } else if (coin.getName() == "Quarter") {
            totalQuarter += coin.getAmount();
        } else if (coin.getName() == "Dollar") {
            totalDollar += coin.getAmount();
        }

        totalValue+=coin.totalDeposit();
        coinArrayList.add(coin);
    }

    public void getHistory() {
        for (Coin c: coinArrayList)
        {
            System.out.println(c.getAmount() + " " + c.getName());
        }
    }

    public void getValue(){
        System.out.println("The piggy bank holds $" + totalValue);
    }

    public void getContents(){
        System.out.println(totalDollar + " Dollar");
        System.out.println(totalQuarter + " Quarter");
        System.out.println(totalDime + " Dime");
        System.out.println(totalNickle + " Nickle");
        System.out.println(totalPenny + " Penny");
    }

    @Override
    public String toString()
    {
        return "Your current saving: " + "\n" +
                totalDollar + " Dollar" + "\n" +
                totalQuarter + " Quarter" + "\n" +
                totalDime + " Dime" + "\n" +
                totalNickle + " Nickle" + "\n" +
                totalPenny + " Penny" + "\n" +
                "Total Value = " + totalValue + "\n";
    }
}
