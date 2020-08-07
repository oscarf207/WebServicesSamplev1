package pe.com.vass.mock.app.model.response;

import lombok.Getter;
import lombok.Setter;

public class CloseOperationResponseModel extends  BaseResponse{

    @Getter
    @Setter
    private String transactionId;

    @Getter
    @Setter
    private String transactionOperation;

    @Getter
    @Setter
    private String transactionDetail;






}
