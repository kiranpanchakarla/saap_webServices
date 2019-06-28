package com.ap.saap.api;

import com.ap.saap.entity.Event;
import com.ap.saap.entity.Stadium;
import com.ap.saap.model.StadiumFiltersModel;
import com.ap.saap.model.StadiumRequestModel;
import com.ap.saap.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/general/stadium")
public class StadiumApi {

    @Autowired
    private StadiumService stadiumService;

    /**
     * find all staidums
     */
    @GetMapping
    public ResponseEntity<List<Stadium>> findAll() {
        return new ResponseEntity<>(stadiumService.findAll(), HttpStatus.OK);
    }

    /**
     * search stadiums
     */
    @PostMapping("/search")
    public ResponseEntity<Set<Stadium>> searchStadium(@RequestBody StadiumRequestModel stadiumRequestModel){
        return new ResponseEntity<Set<Stadium>>(stadiumService.search(stadiumRequestModel), HttpStatus.OK);
    }

    /**
     * refresh stadiums
     */
    @PostMapping("/filters/refresh")
    public ResponseEntity<StadiumFiltersModel> filters(@RequestBody StadiumRequestModel stadiumRequestModel){
        return new ResponseEntity<StadiumFiltersModel>(stadiumService.filters(stadiumRequestModel), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Stadium>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(stadiumService.findById(id), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/district/{districtId}")
    public ResponseEntity<List<Stadium>> findByDistrict(@PathVariable("districtId") long districtId) {
        return new ResponseEntity<>(stadiumService.findByDistrict(districtId), HttpStatus.OK);
    }
}
