package pe.com.vass.mock.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.com.vass.mock.app.model.request.AuthRequestModel;
import pe.com.vass.mock.app.model.response.AuthResponseModel;

import java.util.List;

@RestController
public class AuthController {


    @PostMapping("auth")       //user
    public ResponseEntity authValidation(AuthRequestModel parameter ) { //User

        AuthResponseModel r = new AuthResponseModel();

        r.setResponseCode(8);
        r.setResponseMessage("OK");

        System.out.println("dfdfsaaaAuth322");
        ResponseEntity<AuthResponseModel> response = new ResponseEntity<AuthResponseModel>(r, HttpStatus.OK);

        return response;
    }


}
