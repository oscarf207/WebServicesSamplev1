package pe.com.vass.mock.app.model.response;

import lombok.Getter;
import lombok.Setter;

public class GetDataResponseModel extends BaseResponse{

    @Getter
    @Setter
    private String customerId;

    @Getter
    @Setter
    private String transactionId;

    @Getter
    @Setter
    private String currentService;

    @Getter
    @Setter
    private String proposedService;

    @Getter
    @Setter
    private String additionalService;

    @Getter
    @Setter
    private String termsAndConditions;

    @Getter
    @Setter
    private String userFullName;

    @Getter
    @Setter
    private String userServiceNumber;


}
