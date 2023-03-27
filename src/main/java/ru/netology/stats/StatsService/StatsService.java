package ru.netology.stats.StatsService;

public class StatsService {


    public int getSumSales(int[] sales) {
        int sumSales = 0;
        for (int j : sales) {
            sumSales += j;
        }
        return sumSales;
    }

    public int getAverageSales(int[] sales) {
        int averageSales = 0;
        for (int j : sales) {
            averageSales += j;
        }
        return averageSales / sales.length;
    }


    public int getNumberMonthMaxSales(int[] sales) {
        int monthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSales]) {
                monthMaxSales = i;
            }
        }
        return monthMaxSales + 1;
    }

    public int getNumberMonthMinSales(int[] sales) {
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    public int getMonthBelowAverageSales(int[] sales) {
        int belowAverageMonth = 0;
        for (int sale : sales) {
            if (sale < getAverageSales(sales)) {
                sale = belowAverageMonth++;
            }
        }
        return (int) belowAverageMonth;
    }

    public int getMonthHigherAverageSales(int[] sales) {
        int belowAverageMonth = 0;
        for (int sale : sales) {
            if (sale > getAverageSales(sales)) {
                sale = belowAverageMonth++;
            }
        }
        return (int) belowAverageMonth;
    }
}