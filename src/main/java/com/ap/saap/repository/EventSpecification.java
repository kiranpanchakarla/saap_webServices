package com.ap.saap.repository;

import com.ap.saap.entity.*;
import com.ap.saap.model.StadiumRequestModel;
import com.google.common.collect.Iterables;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Component
public class EventSpecification {
    private static final String PERCENTILE = "%";

    private static String getContainsLikePattern(String searchText) {
        return StringUtils.isEmpty(searchText) ? PERCENTILE : new StringBuilder(PERCENTILE).append(searchText).append(PERCENTILE).toString();
    }

    public Specification<Event> searchEvents(StadiumRequestModel stadiumRequestModel) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            if(stadiumRequestModel.getDistrictId() != null) {
                Join<Event, Stadium> stadiumJoin = root.join("stadium");
                predicates.add(cb.equal(stadiumJoin.<Long>get("districtId"), stadiumRequestModel.getDistrictId()));
            }
            if(stadiumRequestModel.getSportTypeId() != null){
                Join<Event, SportType> sportTypeJoin = root.join("sportType");
                predicates.add(cb.equal(sportTypeJoin.get("id"), stadiumRequestModel.getSportTypeId()));
            }
            if(stadiumRequestModel.getSportId() != null){
                Join<Event, Sport> sportJoin = root.join("playField").join("sport");
                predicates.add(cb.equal(sportJoin.get("id"), stadiumRequestModel.getSportId()));
            }
            if(stadiumRequestModel.getStadiumId() != null){
                predicates.add(cb.equal(root.get("stadium").get("id"), stadiumRequestModel.getStadiumId()));
            }
            if(stadiumRequestModel.getPlayFieldId() != null){
                Join<Event, PlayField> playFieldJoin = root.join("playField");
                predicates.add(cb.equal(playFieldJoin.get("id"), stadiumRequestModel.getPlayFieldId()));
            }
            return cb.and(Iterables.toArray(predicates, Predicate.class));
        };
    }
}
