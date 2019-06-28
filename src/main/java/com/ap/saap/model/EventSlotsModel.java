package com.ap.saap.model;

import com.ap.saap.entity.Event;
import com.ap.saap.entity.SlotsPay;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventSlotsModel {

    private Event event;

    private List<SlotsPay> slots;
}
