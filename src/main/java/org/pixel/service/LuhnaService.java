package org.pixel.service;


import org.pixel.exception.AppExceptionBuilder;
import org.pixel.model.LuhnaData;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class LuhnaService {

    public LuhnaService() { }

    public LuhnaData getLuhnaData(String input) {

        isValid(input);

        int sum = 0;
        for (int i = input.length() - 1; i >= 0; i--) {
            int temp = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (i % 2 == 0) {
                temp *= 2;
                temp = temp >= 10 ? temp - 9 : temp ;
            }
            sum += temp;
        }
        return new LuhnaData(input, sum % 10 == 0 ? 0 : 10 - sum % 10);

    }

    private void isValid(String input){
        try {
            new BigInteger(input);
        } catch (NumberFormatException nfe) {
            throw new AppExceptionBuilder().addError("Podany ciag nie jest liczba").build();
        }
    }
}
