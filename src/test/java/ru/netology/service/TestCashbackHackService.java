package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class TestCashbackHackService {

    CashbackHackService cash = new CashbackHackService();

    @Test
    public void testCashBackHackerPositive() { // Случайное корректное значение суммы.

        int act = cash.remain( 848 );
        int exp = 152;

        Assert.assertEquals( act, exp ) ;
    }

    @Test
    public void testCashBackHackerPositive1() { // Минимальное корректное значение суммы.

        int act = cash.remain( 999 );
        int exp = 1;

        Assert.assertEquals( act, exp ) ;
    }

    @Test
    public void testCashBackHackerPositive999() { // Максимальное корректное значение суммы.

        int act = cash.remain( 1 );
        int exp = 999;

        Assert.assertEquals( act, exp ) ;
    }

    @Test
    public void testCashBackHackerBoundary() { // Передача одинаковой с границей суммы.

        int expected = 0;
        int actual = cash.remain( 1000 );

        Assert.assertEquals( expected, actual);
    }


}
