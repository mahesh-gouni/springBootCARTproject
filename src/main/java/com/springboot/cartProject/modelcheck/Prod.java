package com.springboot.cartProject.modelcheck;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Prod {

    private  int id;
    private String name;
    private  String cat;

}
