package com.ap.saap.api;

import com.ap.saap.entity.District;
import com.ap.saap.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/general/district")
public class DistrictApi {

    @Autowired
    private DistrictService districtService;

    /**
     * find all staidums
     */
    @GetMapping
    public ResponseEntity<List<District>> findAll() {
        return new ResponseEntity<>(districtService.findAll(), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<District>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(districtService.findById(id), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/state/{stateId}")
    public ResponseEntity<List<District>> findByDistrict(@PathVariable("stateId") long stateId) {
        return new ResponseEntity<>(districtService.findByState(stateId), HttpStatus.OK);
    }
}
