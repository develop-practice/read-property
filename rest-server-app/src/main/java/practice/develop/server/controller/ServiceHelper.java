package practice.develop.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.develop.server.model.dto.SampleRequestBody;
import practice.develop.server.model.dto.SampleResponseBody;
import practice.develop.server.property.ApplicationProperties;

@Service
public class ServiceHelper {

	@Autowired
	private ApplicationProperties appProp;

	public SampleResponseBody plus(SampleRequestBody requestBody) {

		SampleResponseBody response = new SampleResponseBody();
		response.setId(requestBody.getId() + appProp.getProp("server.word"));
		response.setResultNum(requestBody.getPlusNum() + Integer.parseInt(appProp.getProp("server.num")));

		return response;
	}
}
