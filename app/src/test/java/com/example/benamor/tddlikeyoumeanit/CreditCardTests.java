package com.example.benamor.tddlikeyoumeanit;

import org.junit.Assert;
import org.junit.Test;

import java.security.cert.Certificate;

import static org.junit.Assert.*;

/**
 One requirement at a time
 Test must be written first
 Test must be shown to fail before you are allowed to write any application code
 Write the minimum possible application code to get the test to pass
 Refactoring code once tests are passing is encouraged
 All tests must pass before you can move on to the next requirement
 */
public class CreditCardTests {
    private static final String ValidCreditCardNumber = "0023456789123451";
    private static final String MildlyInvalidCreditCardNumber = "0023456789123452";
    private static final String InvalidCreditCardNumber = "ABCDEFGHIHKLMNOP";

    @Test
    public void creditCardNumbersMustHaveSixteenCharacters() throws Exception {
        // Arrange
        CreditCard sut = new CreditCard(ValidCreditCardNumber);

        // Act
        String creditCardNumber = sut.CreditCardNumber;

        // Assert
        assertTrue(creditCardNumber.length() == 16);
    }

    // creditCardNumbersMustOnlyHaveNumericCharacters

    @Test (expected = CreditCard.NonNumericalException.class)
    public void creditCardNumbersMustOnlyHaveNumericCharacters() throws Exception {

        CreditCard sut  = new CreditCard(InvalidCreditCardNumber);

        // Act


        // Assert

    }


    @Test (expected = CreditCard.ModuloException.class)
    public void theSumOfAllDigitsInTheCreditCardNumberMustHaveModuloTenEqualToZero() throws Exception {

        CreditCard sut  = new CreditCard(MildlyInvalidCreditCardNumber);

        // Act


        // Assert

    }
    //

    // creditCardsWithExpiryDatesInThePastAreInvalid

    // creditCardsHaveAThreeDigitCVVNumber

    // creditCardsOfTypeVisaMustHaveANumberBeginningWith4

    // creditCardsOfTypeDinersClubMustHaveANumberBeginningWith54or55
}