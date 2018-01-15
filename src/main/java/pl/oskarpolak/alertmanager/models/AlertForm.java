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

    public boolean getIsWarning() {
        return isWarning;
    }

    public void setIsWarning(boolean warning) {
        isWarning = warning;
    }
}
