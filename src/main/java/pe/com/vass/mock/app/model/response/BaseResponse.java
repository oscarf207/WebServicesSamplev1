package pe.com.vass.mock.app.model.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    @Getter
    @Setter
    private int responseCode;

    @Getter
    @Setter
    private String responseMessage;
}
