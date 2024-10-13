package com.bhv.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class Customer {

    private Long id;
    private String name;
    private Map<Integer,String> products;

}
