package pe.com.vass.mock.app.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.com.vass.mock.app.model.request.AuthRequestModel;
import pe.com.vass.mock.app.model.response.AuthResponseModel;
import pe.com.vass.mock.app.util.MockUtils;

import java.util.Date;
import java.util.List;
//q fue
//q vamos hacer?
//el auth controller debe pintar lo mismo de postman... Mira, sale NULL y en postman mandamos otra cosa.
//d ebe ser "clientId"
@RestController
public class AuthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    //AuthRequestModel pT1;

    @PostMapping("auth")       //user
    public ResponseEntity authValidation(@RequestBody AuthRequestModel parameter) { //User


        AuthResponseModel r = new AuthResponseModel();
        r.setResponseCode(8);
        r.setResponseMessage("OK");

        String token = getJwtoken(parameter.getClientId(), parameter.getClientPassword());
        r.setAuthKey(token);

        LOGGER.info(MockUtils.JsonToString(parameter));
        //System.out.println("dataa::"+parameter.getClientId()+" / "+parameter.getClientPassword()+"token :"+r.getAuthKey());


        ResponseEntity<AuthResponseModel> response = new ResponseEntity<AuthResponseModel>(r, HttpStatus.OK);
        LOGGER.info(MockUtils.JsonToString(parameter));

        return response;
    }

    private String getJwtoken(String cid, String cpwd){

        String token = Jwts.builder().setId("softJWT").setSubject(cid)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+6000000))
                .signWith(SignatureAlgorithm.HS512,cpwd.getBytes()).compact();

        System.out.println("Token Generate::: "+token);
        return "Bearer "+token;

    }


}
