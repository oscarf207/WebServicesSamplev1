package pe.com.vass.mock.app.model.request;

import lombok.Getter;
import lombok.Setter;

public class SendDataRequestModel {


    @Getter
    @Setter
    private String transactionId;

    @Getter
    @Setter
    private String userEmail;

    @Getter
    @Setter
    private String userKeyword;
}
