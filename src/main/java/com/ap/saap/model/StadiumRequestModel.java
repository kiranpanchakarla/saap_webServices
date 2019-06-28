package com.ap.saap.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StadiumRequestModel {

    private Long stadiumId;

    private Long sportTypeId;

    private Long districtId;

    private Long sportId;

    private Long playFieldId;

    private String searchText;

	public Long getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(Long stadiumId) {
		this.stadiumId = stadiumId;
	}

	public Long getSportTypeId() {
		return sportTypeId;
	}

	public void setSportTypeId(Long sportTypeId) {
		this.sportTypeId = sportTypeId;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public Long getSportId() {
		return sportId;
	}

	public void setSportId(Long sportId) {
		this.sportId = sportId;
	}

	public Long getPlayFieldId() {
		return playFieldId;
	}

	public void setPlayFieldId(Long playFieldId) {
		this.playFieldId = playFieldId;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
    
    
}
