package pl.oskarpolak.alertmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.oskarpolak.alertmanager.models.AlertForm;
import pl.oskarpolak.alertmanager.models.services.AlertListService;

@Controller
public class MainController {

    @Autowired
    AlertListService alertListService;



    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("alerts", alertListService.getAlertFormList());

        return "index";
    }

    @GetMapping("/addalert")
    public String addAlert(Model model){
        model.addAttribute("alertForm", new AlertForm());
        return "addalert";
    }


    @PostMapping("/addalert")
    public String addAlertPost(@ModelAttribute AlertForm alert, Model model){
        alertListService.addAlertToList(alert);
        System.out.println("Wielkość: " + alertListService.getAlertFormList().size());
        model.addAttribute("info", "Poprawnie dodałeś/aś nowe ostrzeżenie!");
        return "addalert";
    }




}
