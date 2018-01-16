package pl.oskarpolak.alertmanager.models.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import pl.oskarpolak.alertmanager.models.AlertForm;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
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
