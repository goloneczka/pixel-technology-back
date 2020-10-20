package org.pixel.controller;

import org.pixel.model.LuhnaData;
import org.pixel.service.LuhnaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/luhna")
public class LuhnaController {

    private final LuhnaService luhnaService;

    public LuhnaController(LuhnaService luhnaService) {
        this.luhnaService = luhnaService;
    }

    @PostMapping(value = "/{stringNumber}")
    public ResponseEntity<LuhnaData> addWorkerLeaves(@PathVariable String stringNumber) {

        return ResponseEntity.ok()
                .body(luhnaService.getLuhnaData(stringNumber));
    }
}
