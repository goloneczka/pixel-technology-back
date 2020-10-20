package org.pixel.controller;


import com.fasterxml.jackson.core.type.TypeReference;
import org.modelmapper.ModelMapper;
import org.pixel.model.NNPlace;
import org.pixel.model.NNPlaceApi;
import org.pixel.service.NNService;
import org.pixel.validator.NNPlaceValidator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NN")
public class NNController {

    private final NNService nnService;
    private final NNPlaceValidator nnPlaceValidator;
    private final ModelMapper modelMapper;

    public NNController(NNService nnService, NNPlaceValidator nnPlaceValidator, ModelMapper modelMapper) {
        this.nnService = nnService;
        this.nnPlaceValidator = nnPlaceValidator;
        this.modelMapper = modelMapper;
    }

    @PostMapping()
    public ResponseEntity<List<NNPlace>> calculateNN(@RequestBody List<NNPlaceApi> places) {

        places.forEach(nnPlaceValidator::isValidate);

        List<NNPlace> validPlaces = modelMapper.map(places, new TypeReference<List<NNPlace>>() {}.getType());
        return ResponseEntity.ok()
                .body(modelMapper.map(nnService.getNN(validPlaces),
                        new TypeReference<List<NNPlace>>() {}.getType()));
    }
}
