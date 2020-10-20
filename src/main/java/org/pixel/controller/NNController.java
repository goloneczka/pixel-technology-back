package org.pixel.controller;


import org.pixel.model.NNPlace;
import org.pixel.service.NNService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NN")
public class NNController {

    private final NNService nnService;

    public NNController(NNService nnService) {
        this.nnService = nnService;
    }

    @PostMapping(value = "")
    public ResponseEntity<List<NNPlace>> addWorkerLeaves(@RequestBody List<NNPlace> places) {

        return ResponseEntity.ok()
                .body(nnService.getNN(places));
    }
}
