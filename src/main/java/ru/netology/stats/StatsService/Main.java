package ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        System.out.println(service.getSumSales(sales));
        System.out.println(service.getAverageSales(sales));
        System.out.println(service.getNumberMonthMaxSales(sales));
        System.out.println(service.getNumberMonthMinSales(sales));
        System.out.println(service.getMonthBelowAverageSales(sales));
        System.out.println(service.getMonthHigherAverageSales(sales));
    }

}