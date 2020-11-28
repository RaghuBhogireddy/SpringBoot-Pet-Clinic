package io.rrb.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"","/home"})
@Controller
public class IndexController {

    @RequestMapping({"/index","/index.html"})
    public String index(){
        return "index";
    }
}
