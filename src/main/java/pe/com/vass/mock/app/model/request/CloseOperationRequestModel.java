package pe.com.vass.mock.app.model.request;

import lombok.Getter;
import lombok.Setter;

public class CloseOperationRequestModel {

    @Getter
    @Setter
    private String transactionId;

    @Getter
    @Setter
    private int acceptTermsData;

}
