package pe.com.vass.mock.app.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.vass.mock.app.model.request.AuthRequestModel;
import pe.com.vass.mock.app.model.request.GetDataRequestModel;
import pe.com.vass.mock.app.model.response.AuthResponseModel;
import pe.com.vass.mock.app.model.response.GetDataResponseModel;

@RestController
public class GetDataController {

    @PostMapping("getData")       //user
    public ResponseEntity authValidation(GetDataRequestModel parameter ) { //User

        GetDataResponseModel r = new GetDataResponseModel();
        r.setResponseCode(9);
        r.setResponseMessage("OKK");
        System.out.println("dfdfsaaaGetData322");
        ResponseEntity<GetDataResponseModel> response = new ResponseEntity<GetDataResponseModel>(r, HttpStatus.OK);

        return response;
    }

}
