package org.pixel.validator;

import org.pixel.exception.AppExceptionBuilder;
import org.pixel.model.NNPlaceApi;
import org.springframework.stereotype.Component;

@Component
public class NNPlaceValidator {

    public NNPlaceValidator() { }

    public void isValidate(NNPlaceApi nnPlaceApi){

        if (nnPlaceApi.getName().isEmpty())
            throw new AppExceptionBuilder().addError("Nazwa nie moze byc pusta").build();

        try {
            Float.parseFloat(nnPlaceApi.getLatitude());
            Float.parseFloat(nnPlaceApi.getLongitude());
        } catch (NumberFormatException nfe){
            throw new AppExceptionBuilder().addError("Szerokosc / Dlugosc musi byc liczba").build();
        }

    }
}
