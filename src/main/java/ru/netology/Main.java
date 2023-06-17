package ru.netology;

public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1000, 2000, 100, 250};
        SalesManager salesManager = new SalesManager(sales);

        int max = salesManager.max();
        System.out.println(max);
        int min = salesManager.min();
        System.out.println(min);
        double summa = salesManager.summa();
        System.out.println(summa);

    }
}
