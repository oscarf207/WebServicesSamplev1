package pe.com.vass.mock.app.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.vass.mock.app.model.request.AuthRequestModel;
import pe.com.vass.mock.app.model.request.ValidateSmsRequestModel;
import pe.com.vass.mock.app.model.response.AuthResponseModel;
import pe.com.vass.mock.app.model.response.ValidateSmsResponseModel;


@RestController
public class ValidateSmsController {

    @PostMapping("validateSms")       //user
    public ResponseEntity validateSV(ValidateSmsRequestModel parameter ) { //User

        ValidateSmsResponseModel r = new ValidateSmsResponseModel();

        r.setResponseCode(1);
        r.setResponseMessage("OK!");
        ResponseEntity<ValidateSmsResponseModel> response = new ResponseEntity<ValidateSmsResponseModel>(r, HttpStatus.OK);

        return response;
    }

}
