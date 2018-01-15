package pl.oskarpolak.alertmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.oskarpolak.alertmanager.models.AlertForm;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/addalert")
    public String addAlert(Model model){
        model.addAttribute("alertForm", new AlertForm());
        return "addalert";
    }


    @PostMapping("/addalert")
    public String addAlertPost(@ModelAttribute AlertForm alert, Model model){
        System.out.println("Treść z formularza: " + alert.getAlert());
        System.out.println("Czy jest to ostrzeżenie?: " + alert.getIsWarning());

        model.addAttribute("info", "Poprawnie dodałeś/aś nowe ostrzeżenie!");
        return "addalert";
    }


}
