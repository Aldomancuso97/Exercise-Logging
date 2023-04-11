package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicService {


    Logger log = LoggerFactory.getLogger(BasicService.class);




    public int powerExponent(int num1,int num2){
        log.info("operation finished");
        int operation = num1 * num2;
        return operation;


    }



}