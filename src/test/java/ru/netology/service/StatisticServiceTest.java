package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticServiceTest {

    private long[] testArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private StatisticService statisticService = new StatisticService();

    @Test
    void sum() {
        long actual = statisticService.sum(testArray);
        assertEquals(180, actual);
    }

    @Test
    void avg() {
        long actual = statisticService.avg(testArray);
        assertEquals(15, actual);
    }

    @Test
    void maxSales() {
        int actual = statisticService.maxSales(testArray);
        assertEquals(8, actual);
    }

    @Test
    void minSales() {
        int actual = statisticService.minSales(testArray);
        assertEquals(9, actual);
    }

    @Test
    void aboveAvg() {
        int actual = statisticService.aboveAvg(testArray);
        assertEquals(5, actual);
    }

    @Test
    void belowAvg() {
        int actual = statisticService.belowAvg(testArray);
        assertEquals(5, actual);
    }
}