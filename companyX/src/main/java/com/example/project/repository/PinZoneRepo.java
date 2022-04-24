package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.PinZone;

@Repository
public interface PinZoneRepo extends JpaRepository<PinZone, Integer>{
	public PinZone getByPincode(Integer pincode);

}
