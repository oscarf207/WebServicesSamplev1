package pe.com.vass.mock.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.vass.mock.app.model.request.AuthRequestModel;
import pe.com.vass.mock.app.model.request.CloseOperationRequestModel;
import pe.com.vass.mock.app.model.response.AuthResponseModel;
import pe.com.vass.mock.app.model.response.CloseOperationResponseModel;


@RestController
public class CloseOperationController {

    @PostMapping("closeOperation")       //user
    public ResponseEntity closeOV(CloseOperationRequestModel parameter ) { //User

        CloseOperationResponseModel r = new CloseOperationResponseModel();

        r.setResponseCode(1);
        r.setResponseMessage("OK!");
        ResponseEntity<CloseOperationResponseModel> response = new ResponseEntity<CloseOperationResponseModel>(r, HttpStatus.OK);

        return response;
    }

}
