package com.currency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RupeeTest {

    @Test
    public void shouldReturnTrueIfTwoRupeeValuesAreEqual(){
        Rupee rupee1 = new Rupee(10);
        Rupee rupee2 = new Rupee(10);
        assertTrue(rupee1.compareTwoRupees(rupee2));
    }

    @Test
    public void shouldReturnFalseIfTwoRupeeValuesAreNotEqual() {
        Rupee rupee1 = new Rupee(20);
        Rupee rupee2 = new Rupee(5);
        assertFalse(rupee1.compareTwoRupees(rupee2));
    }

    @Test
    public void shouldReturnAdditionOfTwoRupeeValues(){
        Rupee rupee1 = new Rupee(5);
        Rupee rupee2 = new Rupee(25);
        Rupee resultRupee = new Rupee(30);
        assertEquals(resultRupee.getValue(),rupee1.add(rupee2).getValue());
    }
}