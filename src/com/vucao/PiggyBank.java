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


}
