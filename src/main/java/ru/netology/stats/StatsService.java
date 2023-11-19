package ru.netology.stats;

public class StatsService {
    long sum(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }
        return totalSale;
    }

    long average(long[] sales) {

        return sum(sales) / 12;
    }

    int calcmaxMonthSale(long[] sales) {
        int maxMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSale]) {
                maxMonthSale = i;
            }
        }

        return maxMonthSale + 1;

    }

    int calcminMonthSale(long[] sales) {
        int minMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonthSale]) {
                minMonthSale = i;
            }
        }

        return minMonthSale + 1;
    }

    int calcMonthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;

            }
        }

        return counter;

    }

    int calcMonthsHighterAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;

            }
        }

        return counter;

    }

}




