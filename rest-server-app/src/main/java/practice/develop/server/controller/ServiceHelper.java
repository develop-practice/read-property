package practice.develop.server.controller;

import org.springframework.stereotype.Service;

import practice.develop.server.model.dto.SampleRequestBody;
import practice.develop.server.model.dto.SampleResponseBody;

@Service
public class ServiceHelper {

	public SampleResponseBody plus(SampleRequestBody requestBody) {

		SampleResponseBody response = new SampleResponseBody();
		response.setId(requestBody.getId());
		response.setResultNum(requestBody.getPlusNum() + 1);

		return response;
	}
}
