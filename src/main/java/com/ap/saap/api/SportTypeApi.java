package com.ap.saap.api;

import com.ap.saap.entity.SportType;
import com.ap.saap.service.SportTypeService;
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
@RequestMapping("/api/general/sportType")
public class SportTypeApi {

    @Autowired
    private SportTypeService sportTypeService;

    /**
     * find all staidums
     */
    @GetMapping
    public ResponseEntity<List<SportType>> findAll() {
        return new ResponseEntity<>(sportTypeService.findAll(), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<SportType>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(sportTypeService.findById(id), HttpStatus.OK);
    }
}
