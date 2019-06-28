package com.ap.saap.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.saap.service.FacilitiesService;

@RestController
@RequestMapping(value ="/api/general/facilities", produces = MediaType.APPLICATION_JSON_VALUE)
public class FacilitiesApi {
    @Autowired
    FacilitiesService facilitiesService;
    
	@RequestMapping(value="/allDistricts")
	public List getAllDistricts() {
		List districtsList = new ArrayList<>();
		districtsList=facilitiesService.getAllDistricts();
		return districtsList;
	}
	
	
	@RequestMapping(value="/allfacilities")
	public List getAllFacilities() {
		List facilitiesList= new ArrayList();
		facilitiesList=facilitiesService.getAllFacilities();
		return facilitiesList;
	}
	
	@RequestMapping(value="/facilities/{districtId}")
	public List getFacilitiesByDistrictId() {
		List facilitiesList =new ArrayList();
		
		
		return facilitiesList;
	}
}
