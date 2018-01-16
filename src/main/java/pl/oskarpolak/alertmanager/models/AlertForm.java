package pl.oskarpolak.alertmanager.models;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AlertForm {
    @Size(min = 5, max = 6)
    //@Min()
    //@Max
    @NotNull
    //@Email
    @Pattern(regexp = "[0-9]{2}-?[0-9]{3}")
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
