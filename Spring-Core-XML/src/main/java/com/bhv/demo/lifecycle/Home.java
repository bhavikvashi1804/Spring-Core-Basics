package com.bhv.demo.lifecycle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Home {

    private String name;

    public void setName(String name) {
        System.out.println("Setter Called");
        this.name = name;
    }

    public void doSetUp(){
        System.out.println("Do Set Up Called");
    }

    public void doCleanUp(){
        System.out.println("Do Clean Up Called");
    }

}
