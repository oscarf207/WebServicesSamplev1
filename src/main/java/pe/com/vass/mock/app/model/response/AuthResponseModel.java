package pe.com.vass.mock.app.model.response;

import lombok.Getter;
import lombok.Setter;

public class AuthResponseModel extends BaseResponse {

    private String authKey;

    public AuthResponseModel() {
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
}
