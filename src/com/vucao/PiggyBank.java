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


}
