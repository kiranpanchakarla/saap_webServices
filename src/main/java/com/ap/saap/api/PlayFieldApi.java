package com.ap.saap.api;

import com.ap.saap.entity.PlayField;
import com.ap.saap.service.PlayFieldService;
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
@RequestMapping("/api/general/playField")
public class PlayFieldApi {

    @Autowired
    private PlayFieldService playFieldService;

    /**
     * find all staidums
     */
    @GetMapping
    public ResponseEntity<List<PlayField>> findAll() {
        return new ResponseEntity<>(playFieldService.findAll(), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<PlayField>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(playFieldService.findById(id), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/sport/{sportId}")
    public ResponseEntity<List<PlayField>> findBySport(@PathVariable("sportId") long sportId) {
        return new ResponseEntity<>(playFieldService.findBySport(sportId), HttpStatus.OK);
    }
}
