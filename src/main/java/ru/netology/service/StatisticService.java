package ru.netology.service;

public class StatisticService {

    public long sum(long[] sales) {
        int result = 0;
        for (long value : sales) {
            result += value;
        }

        return result;
    }

    public long avg(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int aboveAvg(long[] sales) {
        int result = 0;
        long avg = avg(sales);
        for (int i = 0; i < sales.length; i++) {
            if (avg < sales[i]) {
                result++;
            }
        }

        return result;
    }

    public int belowAvg(long[] sales) {
        int result = 0;
        long avg = avg(sales);
        for (int i = 0; i < sales.length; i++) {
            if (avg > sales[i]) {
                result++;
            }
        }

        return result;
    }

}
