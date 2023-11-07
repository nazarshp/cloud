package com.ua.lviv.iot.lab5_back_end.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Builder
@Getter
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(itemRelation = "hotel", collectionRelation = "hotels")
public class HotelDto extends RepresentationModel<HotelDto> {
    private final Integer id;
    private final String name;
    private final String phone;
    private final String hotel_code;
}
