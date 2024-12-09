package com.springboot.cartProject.servicecheck;


import com.springboot.cartProject.modelcheck.Prod;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProdServ {

    List<Prod> prodList =  Arrays.asList(
            new Prod(1, "zoom", "online"),
            new Prod(2, "spring", "youtube"),
            new Prod(3, "text", "paper"),
            new Prod(4, "charger", "electronics")

            );


    public List<Prod> requstserv(){

        return prodList;
    }


    public Prod gettingprodyId(int prodId) {

        return prodList.stream().filter(prd -> prd.getId()==prodId).findFirst().get();
    }


}
