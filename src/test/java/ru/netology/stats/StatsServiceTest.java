package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMaxMonthSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcmaxMonthSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinMonthSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcminMonthSale(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testcalcMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcMonthsBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testcalcMonthsHighterAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.calcMonthsHighterAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}





