package com.ap.saap.api;

import com.ap.saap.entity.Event;
import com.ap.saap.entity.Stadium;
import com.ap.saap.model.EventSlotsModel;
import com.ap.saap.model.StadiumRequestModel;
import com.ap.saap.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/general/event")
public class EventApi {

    @Autowired
    private EventService eventService;

    /**
     * find all staidums
     */
    @GetMapping
    public ResponseEntity<List<Event>> findAll() {
        return new ResponseEntity<>(eventService.findAll(), HttpStatus.OK);
    }

    /**
     * find all staidums
     */
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Event>> findById(@PathVariable("id") long id) {
        return new ResponseEntity<>(eventService.findById(id), HttpStatus.OK);
    }

    /**
     * search Event slots
     */
    @PostMapping("/searchSlots")
    public ResponseEntity<Set<EventSlotsModel>> searchStadium(@RequestBody StadiumRequestModel stadiumRequestModel){
        return new ResponseEntity<Set<EventSlotsModel>>(eventService.searchSlots(stadiumRequestModel), HttpStatus.OK);
    }
}
