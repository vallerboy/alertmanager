package pl.oskarpolak.alertmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/addalert")
    public String addAlert(){
        return "addalert";
    }

}
