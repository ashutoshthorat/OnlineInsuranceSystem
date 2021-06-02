package com.bridgelabz.insurancesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.insurancesystem.dto.InsuranceCreateDTO;
import com.bridgelabz.insurancesystem.dto.UserDTO;
import com.bridgelabz.insurancesystem.service.IInsuranceCreateService;
import com.bridgelabz.insurancesystem.util.Response;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/newinsurance")
@Slf4j
public class InsuranceCreateController {
	@Autowired
	private IInsuranceCreateService insuranceService;
	
	@PostMapping("/createInsurance")
	public ResponseEntity<Response> createInsurance(@RequestBody InsuranceCreateDTO insuranceDTO){
		log.debug("Create User : " + insuranceDTO);
		Response response = insuranceService.addinsurance(insuranceDTO);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	@GetMapping("/getallinsurance")
	public ResponseEntity<List<?>> getallinsurance(){
//		log.debug("Create User : " + insuranceDTO);
		List<?> response = insuranceService.getall();
		return new ResponseEntity<List<?>>(response,HttpStatus.OK);
	}
}
