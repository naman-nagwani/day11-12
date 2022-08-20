package com.bridgelabz.stock;

public class Stock {
    String stockName;
    double sharePrice;
    double shareNumber;

    Stock(String stockName,double sharePrice,double shareNumber){
        this.stockName = stockName;
        this.sharePrice = sharePrice;
        this.shareNumber = shareNumber;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", sharePrice=" + sharePrice +
                ", shareNumber=" + shareNumber +
                '}';
    }
}
