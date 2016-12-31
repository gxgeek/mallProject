package com.gx.core.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import javax.xml.crypto.Data;

/**
 * Created by gx on 2016/12/27.
 */

@Controller
public class CenterController  {
    private Logger  log = Logger.getLogger(CenterController.class);
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String test(String name, Data birthday){

        System.out.println("");
        return null;
    }



    //局部绑定
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {

    }
}
