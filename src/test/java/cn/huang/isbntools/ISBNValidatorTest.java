package cn.huang.isbntools;

import org.junit.Test;

import static org.junit.Assert.*;

public class ISBNValidatorTest {

    public void checkAValid10DigitISBN() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN("0140449116");
        assertTrue("first value", result);
        result = validator.checkISBN("0140177396");
        assertTrue("second value", result);
    }

    @Test
    public void checkAValid13DigitISBN() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN("9781853260087");
        assertTrue("first value", result);
        result = validator.checkISBN("9781853267338");
        assertTrue("second value", result);
    }

    @Test
    public void TenDigitISBNNumbersEndingInAnXAreValid() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkAnInvalid10DigitISBN() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN("0140449117");
        assertFalse(result);
    }

    @Test
    public void checkAnInvalid13DigitISBN() {
        ISBNValidator validator = new ISBNValidator();
        boolean result = validator.checkISBN("9781853267336");
        assertFalse(result);
    }

    @Test(expected = NumberFormatException.class)
    public void nineDigitISBNsAreNotAllowed() {
        ISBNValidator validator = new ISBNValidator();
        validator.checkISBN("123456789");
    }

    @Test(expected = NumberFormatException.class)
    public void nonNumericISBNsAreNotAllowed() {
        ISBNValidator validator = new ISBNValidator();
        validator.checkISBN("helloworld");
    }


}