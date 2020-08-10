package pe.com.vass.mock.app.model.request;

import lombok.Getter;
import lombok.Setter;

public class AuthRequestModel {


    private String clientId;


    private String clientPassword;

    public AuthRequestModel() {
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }
}
