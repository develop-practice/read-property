package practice.develop.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import practice.develop.server.model.dto.SampleRequestBody;
import practice.develop.server.model.dto.SampleResponseBody;

@RestController

public class ServerController {

	@Autowired
	private ServiceHelper helper;

	@RequestMapping(value = "/get-server", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public void get() {

		System.out.println("OK");
	}

	@RequestMapping(value = "/post-server", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public SampleResponseBody post(@RequestBody SampleRequestBody requestBody) {

		return helper.plus(requestBody);
	}
}