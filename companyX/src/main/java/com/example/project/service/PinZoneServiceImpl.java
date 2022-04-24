package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.PinZone;
import com.example.project.repository.PinZoneRepo;


@Service
public class PinZoneServiceImpl implements PinZoneService {

	
	@Autowired
	PinZoneRepo pinZoneRepo;
	
	@Override
	public PinZone getZone(Integer pincode) {
		return pinZoneRepo.getByPincode(pincode);
	}

}
