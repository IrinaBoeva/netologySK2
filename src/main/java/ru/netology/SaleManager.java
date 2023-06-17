package ru.netology;

class SalesManager {
    protected int[] sales, i;

    float summa = 0;
    double average = 0;


    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;

    }

    public int min() {
        int min = 1000000;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;

    }

    public float summa() {

        for (int sale : sales) {
            summa = summa + sale;
        }
        return summa;

    }
}

