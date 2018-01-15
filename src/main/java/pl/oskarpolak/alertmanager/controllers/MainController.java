package pl.oskarpolak.alertmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String addAlertPost(@ModelAttribute("alertForm") AlertForm alertForm){
        System.out.println("Treść z formularza: " + alertForm.getAlert());
        System.out.println("Czy jest to ostrzeżenie?: " + alertForm.getIsWarning());
        return "addalert";
    }


}
