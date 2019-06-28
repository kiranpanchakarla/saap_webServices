package com.ap.saap.api;

import com.ap.saap.entity.Sport;
import com.ap.saap.service.SportService;
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
@RequestMapping("/api/general/sport")
public class SportApi {

    @Autowired
    private SportService sportService;

    /**
     * find all staidums
     */
    @GetMapping
    public ResponseEntity<List<Sport>> findAll() {
        return new ResponseEntity<>(sportService.findAll(), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Sport>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(sportService.findById(id), HttpStatus.OK);
    }
}
