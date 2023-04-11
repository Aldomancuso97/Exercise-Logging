package co.develhope.logging.controllers;
import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BasicController {


    Logger log = LoggerFactory.getLogger(BasicController.class);

    private Environment environment;

    @Value("${customEnvs.n1}")
    int num1;

    @Value("${customEnvs.n2}")
    int num2;


    @Autowired
    BasicService basicService;


    @GetMapping("/get")
    public String welcomeMessage(){
        log.info("status : OK");
        return "welcome to my new program";

    }

    @GetMapping("/exp")
    public int powerExponent() {
        return basicService.powerExponent(num1, num2);



    }

    @GetMapping("/get-errors")
    public ResponseEntity getError() {
        log.error("a new error is entering in scene");
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("the error is in console");


    }

}