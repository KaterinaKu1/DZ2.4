package ru.netology.stats;

public class StatisticsService {
  public long calculateSum(long[] purchases) {
    long sum = 0;
    for (long purchase : purchases) {
      // аналог sum = sum + purchase;
      sum += purchase;
    }
    return sum;
  }

  public long monthAverage(long[] purchases) {
      long monthCount = purchases.length;
      long sum = calculateSum(purchases);
      return sum/monthCount;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long monthBelowAverage(long[] purchases) {
        long average = monthAverage(purchases);
        long monthBelow = 0;
        for (long purchase : purchases) {
           if (purchase < average) {
               monthBelow += 1;
           }
        }
        return monthBelow;
    }


    public long monthAboveAverage(long[] purchases) {
        long average = monthAverage(purchases);
        long monthAbove = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                monthAbove += 1;
            }
        }
        return monthAbove;
    }
}
