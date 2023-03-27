package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 180;
        int actualDay = service.getSumSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 15;
        int actualDay = service.getAverageSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindNumberMonthMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.getNumberMonthMaxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindNumberMonthMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.getNumberMonthMinSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMonthBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.getMonthBelowAverageSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMonthHigherAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.getMonthHigherAverageSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}

