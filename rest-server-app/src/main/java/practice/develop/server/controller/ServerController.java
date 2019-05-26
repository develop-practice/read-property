package practice.develop.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	
    @RequestMapping(value = "/get-server", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void get() {

    	System.out.println("OK");
    
    }
}