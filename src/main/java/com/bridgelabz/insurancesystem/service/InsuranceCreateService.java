package com.bridgelabz.insurancesystem.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.insurancesystem.dto.InsuranceCreateDTO;
import com.bridgelabz.insurancesystem.entity.InsuranceCreateEntity;
import com.bridgelabz.insurancesystem.repository.IInsuranceCreateRepository;
import com.bridgelabz.insurancesystem.util.Response;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class InsuranceCreateService implements IInsuranceCreateService{

	@Autowired
	IInsuranceCreateRepository insurancerepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	public Response addinsurance(InsuranceCreateDTO insuranceDTO) {
		
		InsuranceCreateEntity entity=modelMapper.map(insuranceDTO, InsuranceCreateEntity.class);
		insurancerepo.save(entity);
		return null;
	}


	@Override
	public List<?> getall() {
		return this.insurancerepo.findAll();
	}

}
