package org.scoula.dynamicweb.ex03.controller;

import lombok.extern.log4j.Log4j;
import org.scoula.dynamicweb.ex03.dto.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sample")
@Log4j
public class SampleController {

    @RequestMapping("") // url : /sample
    public void basic() {
        log.info("basic.............");
    }

    //  url : /sample/basic
    @RequestMapping(value="/basic", method= {RequestMethod.GET, RequestMethod.POST})
    public void basicGet(){
        log.info("basicGet.............");
    }

    // url: /sample/basicOnlyGet
    @GetMapping("/basicOnlyGet")
    public void basicGet2(){
        log.info("basic get only get..........");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto){
        log.info("" + dto);
        return "ex01";
    }
}
