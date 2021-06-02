package com.bridgelabz.insurancesystem.service;

import java.util.List;

import com.bridgelabz.insurancesystem.dto.InsuranceCreateDTO;
import com.bridgelabz.insurancesystem.util.Response;

public interface IInsuranceCreateService {

	Response addinsurance(InsuranceCreateDTO insuranceDTO);

	List<?> getall();

}
