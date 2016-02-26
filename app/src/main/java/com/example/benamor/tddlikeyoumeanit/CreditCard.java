package com.example.benamor.tddlikeyoumeanit;

/**
 * Created by Ben Amor on 2/26/2016.
 */
public class CreditCard {

    public String CreditCardNumber;

    CreditCard(String preferablyNerumericalCreditCardString) throws NonNumericalException, ModuloException {
        CreditCardNumber = preferablyNerumericalCreditCardString;

        // 16 digits
        for(int i = 0; i < CreditCardNumber.length(); i++) {
            Integer asciiValue = (int)CreditCardNumber.charAt(i);
            if ((asciiValue < 48) || (asciiValue > 57)) {
                throw new NonNumericalException();
            }
        }

        // Luhn check
        Integer sum = 0;
        for(int i = 0; i < CreditCardNumber.length(); i++) {
            sum += Integer.parseInt(CreditCardNumber.substring(i, i + 1));
        }

        if (sum % 10 != 0) {
            throw new ModuloException();
        }
    }

    public class ModuloException extends Exception{
        ModuloException() {
            super("Your CC Number is not modulo 10");
        }
    }

    public class NonNumericalException extends Exception{
        NonNumericalException()
        {
            super("Your CC number is not numeric");
        }
    }
}
