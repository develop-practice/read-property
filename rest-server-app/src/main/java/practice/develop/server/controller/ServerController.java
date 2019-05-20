package practice.develop.server.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.resource.HttpResource;

import practice.develop.server.service.ServerService;

@RestController
public class ServerController {

	@Autowired
	ServerService serverService;
	
    @RequestMapping(value = "/create_json", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    //public void dispJson(HashMap JsonMaterial) {
    public void dispString() {
        //String json = serverService.createJson(JsonMaterial);
        System.out.println("OK");

    }
}