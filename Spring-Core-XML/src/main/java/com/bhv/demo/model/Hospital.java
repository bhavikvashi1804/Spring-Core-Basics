package com.bhv.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Hospital {

    private String name;
    private List<String> departments;
}
