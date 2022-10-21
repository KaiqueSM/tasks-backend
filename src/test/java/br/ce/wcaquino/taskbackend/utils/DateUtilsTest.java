package br.ce.wcaquino.taskbackend.utils;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDatasFuturas(){
        LocalDate data = LocalDate.of(2300, 01, 01);
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(data));
    }

    @Test
    public void deveRetornarFalseParaDataspassadas(){
        LocalDate data = LocalDate.of(2000, 01, 01);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(data));
    }

    @Test
    public void deveRetornarTrueParaDataPresnte(){
        LocalDate data = LocalDate.now();
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(data));
    }
}