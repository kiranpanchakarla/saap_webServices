package com.ap.saap.api;

import com.ap.saap.entity.State;
import com.ap.saap.service.StateService;
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
@RequestMapping("/api/general/state")
public class StateApi {

    @Autowired
    private StateService stateService;

    /**
     * find all staidums
     */
    @GetMapping
    public ResponseEntity<List<State>> findAll() {
        return new ResponseEntity<>(stateService.findAll(), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<State>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(stateService.findById(id), HttpStatus.OK);
    }
}
