package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
  @Test
  void calculateSum() {
    StatisticsService service = new StatisticsService();

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 180;

    long actual = service.calculateSum(purchases);

    assertEquals(expected, actual);
  }

  @Test
  void monthAverage() {
    StatisticsService service = new StatisticsService();

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 15;

    long actual = service.monthAverage(purchases);

    assertEquals(expected, actual);
  }

  @Test
  void maxSales() {
    StatisticsService service = new StatisticsService();

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 8;

    long actual = service.maxSales(purchases);

    assertEquals(expected, actual);
  }

  @Test
  void minSales() {
    StatisticsService service = new StatisticsService();

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 9;

    long actual = service.minSales(purchases);

    assertEquals(expected, actual);
  }

  @Test
  void monthBelowAverage() {
    StatisticsService service = new StatisticsService();

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 5;

    long actual = service.monthBelowAverage(purchases);

    assertEquals(expected, actual);
  }

  @Test
  void monthAboveAverage() {
    StatisticsService service = new StatisticsService();

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expected = 5;

    long actual = service.monthAboveAverage(purchases);

    assertEquals(expected, actual);
  }
}