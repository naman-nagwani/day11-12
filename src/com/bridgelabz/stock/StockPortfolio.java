package com.bridgelabz.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {
    public static Scanner scan = new Scanner(System.in);
    public static List<Stock> stocks = new ArrayList<>();
    public static void main(String[] args) {
        int choice=0;
        while (choice!=4) {
            System.out.println("1. Add a new Stock \n2. Print all stocks \n3. Total value of stocks \n4. Exit");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:
                    addNewStocks();
                    break;
                case 2:
                    printAllStocks();
                    break;
                case 3:
                    totalStocksValue();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    private static void totalStocksValue() {
        double sum=0.0;
        for (Stock stock : stocks) {
            sum+=(stock.sharePrice*stock.shareNumber);
        }
        System.out.println("total value of all stocks is : " +sum);
    }

    private static void printAllStocks() {

        for (Stock stock: stocks) {
            System.out.println(stock);
        }

    }

    public static void addNewStocks() {
        System.out.println("Enter the name of stock");
        String name = scan.nextLine();
        System.out.println("Enter the share price");
        Double sharePrice = scan.nextDouble();
        System.out.println("Enter the number of shares");
        Double shareNumber = scan.nextDouble();

        Stock stock = new Stock(name,sharePrice,shareNumber);
        stocks.add(stock);
    }
}
