package com.springboot.cartProject.controllerCheck;

import com.springboot.cartProject.modelcheck.Prod;
import com.springboot.cartProject.servicecheck.ProdServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

//@RestController // return the data
@RestController//retuns the pages jsp or html
public class HomeController {

    @Autowired
  private   ProdServ prodServ;
    private static final Logger logger = Logger.getLogger(HomeController.class.getName());
    @RequestMapping("/") //accept all types of method of http
   // @ResponseBody
    public String text(){
logger.info("hello");
        return "boku read and concentrate";
    }

@RequestMapping("/prod")
    public List<Prod> request(){
logger.info("coming to request");
        return prodServ.requstserv();
    }

}
