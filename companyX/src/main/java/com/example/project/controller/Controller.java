package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.project.model.PinZone;
import com.example.project.payload.BillRequest;
import com.example.project.payload.BillResponse;
import com.example.project.payload.Request;
import com.example.project.payload.Response;
import com.example.project.service.PinZoneService;

@RestController
@RequestMapping(value="/biller")
public class Controller {
	
	
	@Autowired
	PinZoneService pinZoneService;
	
	@PostMapping("/call")
	private BillResponse calculate(@RequestBody BillRequest req) {
		PinZone  pz = pinZoneService.getZone(req.getPin());
		Request corReq = new Request(pz.getzone(), req.getWeight(), req.getType());	
		RestTemplate template = new RestTemplate();
		Response res = template.postForObject("http://localhost:8080/rate", corReq, Response.class);
		BillResponse bill = new BillResponse();
		bill.setBill(res.getPrice().floatValue());
		return bill;
	}
	

}