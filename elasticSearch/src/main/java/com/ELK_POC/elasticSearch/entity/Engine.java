package com.ELK_POC.elasticSearch.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(value = {"color", "serialNumber"})
public class Engine {

    private String fuelType;
    private int horsePower;
    @Builder.Default
    private String color = "Black";
    @Builder.Default
    private String serialNumber = "SN0000001";
}