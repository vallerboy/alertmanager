package pl.oskarpolak.alertmanager.models;

import javax.validation.constraints.Size;

public class AlertForm {
    @Size(min = 4, max = 50, message = "Alert nie może być krótszy niż 4 znaki i dłuższy niż 50")
    private String alert;
    private Boolean isWarning;

    public AlertForm() {
        isWarning = true;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public Boolean getIsWarning() {
        return isWarning;
    }

    public void setIsWarning(Boolean warning) {
        isWarning = warning;
    }
}
