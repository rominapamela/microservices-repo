package com.todocodeacademy.hotelsservice.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

    private Long id;
    private String name;
    private int stars;
    private Long city_id;

}
