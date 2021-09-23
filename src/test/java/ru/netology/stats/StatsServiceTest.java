package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void getTotalSale() {
        int expected = 180;
        StatsService service = new StatsService();
        int actual = service.getTotalSale(sales);
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void getAverageSale() {
        double expected = 15.0;
        StatsService service = new StatsService();
        double actual = service.getAverageSale(sales);
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void getMonthWithMaximumSale() {
        int expected = 8;
        StatsService service = new StatsService();
        int actual = service.getMonthWithMaximumSale(sales);
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void getMonthWithMinimumSale() {
        int expected = 9;
        StatsService service = new StatsService();
        int actual = service.getMonthWithMinimumSale(sales);
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void getAmountMonthLowSales() {
        int expected = 5;
        StatsService service = new StatsService();
        int actual = service.getAmountMonthLowSales(sales);
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void getAmountMonthHighSales() {
        int expected = 5;
        StatsService service = new StatsService();
        int actual = service.getAmountMonthHighSales(sales);
        assertEquals(actual, expected);
    }
}