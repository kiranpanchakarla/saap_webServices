package com.ap.saap.service.impl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.saap.repository.DistrictRepository;
//import com.ap.saap.repository.FacilitiesRepository;
import com.ap.saap.service.FacilitiesService;

@Service
public class FacilitiesServiceImpl implements FacilitiesService{
	//@Autowired
	//FacilitiesRepository facilitiesRepository;
	@Autowired
	DistrictRepository districtRepository;

	@Override
	public List getAllDistricts() {
		List districtsList =new ArrayList();
		districtsList=districtRepository.findAll();
		
		return districtsList;
	}

	@Override
	public List getAllFacilities() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
