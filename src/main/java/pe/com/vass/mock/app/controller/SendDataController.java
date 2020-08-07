package pe.com.vass.mock.app.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.vass.mock.app.model.request.AuthRequestModel;
import pe.com.vass.mock.app.model.request.SendDataRequestModel;
import pe.com.vass.mock.app.model.response.AuthResponseModel;
import pe.com.vass.mock.app.model.response.SendDataResponseModel;


@RestController
public class SendDataController {

    @PostMapping("sendData")       //user
    public ResponseEntity authValidation(SendDataRequestModel parameter ) { //User

        SendDataResponseModel r = new SendDataResponseModel();

        r.setResponseCode(1);
        r.setResponseMessage("OK!");
        ResponseEntity<SendDataResponseModel> response = new ResponseEntity<SendDataResponseModel>(r, HttpStatus.OK);

        return response;
    }

}
