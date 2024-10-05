package com.bhv.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
public class CarDealer {

    private  String name;
    private Set<String> models;
}
