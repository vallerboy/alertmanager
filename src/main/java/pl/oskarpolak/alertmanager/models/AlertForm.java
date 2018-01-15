package pl.oskarpolak.alertmanager.models;

public class AlertForm {
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
