package pl.oskarpolak.alertmanager.models;

public class AlertForm {
    private String alert;
    private boolean isWarning;

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public boolean isWarning() {
        return isWarning;
    }

    public void setWarning(boolean warning) {
        isWarning = warning;
    }
}
