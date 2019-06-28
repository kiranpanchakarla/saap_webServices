package com.ap.saap.model;

import com.ap.saap.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StadiumFiltersModel {
	 
	

    private List<Stadium> stadiums;

    private List<SportType> sportTypes;

    private List<District> districts;

    private List<Sport> sports;

    private List<PlayField> playFields;

	public List<Stadium> getStadiums() {
		return stadiums;
	}

	public void setStadiums(List<Stadium> stadiums) {
		this.stadiums = stadiums;
	}

	public List<SportType> getSportTypes() {
		return sportTypes;
	}

	public void setSportTypes(List<SportType> sportTypes) {
		this.sportTypes = sportTypes;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}

	public List<PlayField> getPlayFields() {
		return playFields;
	}

	public void setPlayFields(List<PlayField> playFields) {
		this.playFields = playFields;
	}

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
