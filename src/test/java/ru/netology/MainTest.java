package ru.netology;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    int[] sales = new int[]{10, 2000, 1000, 450};
    SalesManager salesManager = new SalesManager(sales);

    @org.junit.jupiter.api.Test
    void test_max_method() {
        int expect = 2000;

        int resalt = salesManager.max();

        Assertions.assertEquals(expect, resalt);

    }
    @org.junit.jupiter.api.Test
    void test_min_method() {
        int expect = 10;

        int resalt = salesManager.min();

        Assertions.assertEquals(expect, resalt);

    }
    @org.junit.jupiter.api.Test
    void test_summa_method() {
        float expect = 3460;

        float resalt = salesManager.summa();

        Assertions.assertEquals(expect, resalt);

    }
}
