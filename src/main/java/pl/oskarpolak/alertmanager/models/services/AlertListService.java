package pl.oskarpolak.alertmanager.models.services;

import org.springframework.stereotype.Service;
import pl.oskarpolak.alertmanager.models.AlertForm;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlertListService {
    private List<AlertForm> alertFormList;

    public AlertListService() {
        alertFormList = new ArrayList<>();
    }

    public List<AlertForm> getAlertFormList() {
        return alertFormList;
    }

    public void addAlertToList(AlertForm form){
        alertFormList.add(form);
    }

    //Pies pies = Pies.getInstance();
    //Pies pies1 = new Pies(); - to nie zadziała
}
