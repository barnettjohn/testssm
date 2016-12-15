package com.zqw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/12/8.
 */
@Controller
@RequestMapping("/home")
public class IndexController {
    private static final Logger logger= LoggerFactory.getLogger(IndexController.class);
    @RequestMapping("/index")
    public String index(){
        logger.info("the first jsp pages");
        System.out.printf("aaaaaaaa");
        return "index";
    }
}
