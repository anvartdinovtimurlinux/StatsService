package ru.netology.stats;

public class StatsService {

    public int getTotalSale(int[] sales) {
        int totalSale = 0;
        for (int sale: sales) {
            totalSale += sale;
        }

        return totalSale;
    }

    public double getAverageSale(int[] sales) {
        int totalSales = getTotalSale(sales);

        return (double) totalSales / sales.length;
    }

    public int getMonthWithMaximumSale(int[] sales) {
        int monthWithMaximumSale = 0;
        int currentMonth = 1;
        int maximumSale = sales[0];
        for (int sale: sales) {
            if (sale >= maximumSale) {
                maximumSale = sale;
                monthWithMaximumSale = currentMonth;
            }
            currentMonth++;
        }

        return monthWithMaximumSale;
    }

    public int getMonthWithMinimumSale(int[] sales) {
        int monthWithMinimumSale = 0;
        int currentMonth = 1;
        int minimumSale = sales[0];
        for (int sale: sales) {
            if (sale <= minimumSale) {
                minimumSale = sale;
                monthWithMinimumSale = currentMonth;
            }
            currentMonth++;
        }

        return monthWithMinimumSale;
    }

    public int getAmountMonthLowSales(int[] sales) {
        int amountMonthLowSales = 0;
        double averageSale = getAverageSale(sales);
        for (int sale: sales) {
            if (sale < averageSale) {
                amountMonthLowSales++;
            }
        }

        return amountMonthLowSales;
    }

    public int getAmountMonthHighSales(int[] sales) {
        int amountMonthHighSales = 0;
        double averageSale = getAverageSale(sales);
        for (int sale: sales) {
            if (sale > averageSale) {
                amountMonthHighSales++;
            }
        }

        return amountMonthHighSales;
    }

}