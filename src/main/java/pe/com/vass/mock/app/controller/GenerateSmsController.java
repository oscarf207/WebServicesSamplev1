package pe.com.vass.mock.app.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.vass.mock.app.model.request.AuthRequestModel;
import pe.com.vass.mock.app.model.request.GenerateSmsRequestModel;
import pe.com.vass.mock.app.model.response.AuthResponseModel;
import pe.com.vass.mock.app.model.response.GenerateSmsResponseModel;


@RestController
public class GenerateSmsController {

    @PostMapping("generateSms")       //user
    public ResponseEntity authValidation(GenerateSmsRequestModel parameter ) { //User

        GenerateSmsResponseModel r = new GenerateSmsResponseModel();

        r.setResponseCode(1);
        r.setResponseMessage("OK!");
        ResponseEntity<GenerateSmsResponseModel> response = new ResponseEntity<GenerateSmsResponseModel>(r, HttpStatus.OK);

        return response;
    }



}
