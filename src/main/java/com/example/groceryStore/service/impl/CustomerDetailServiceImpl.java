package com.example.groceryStore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.groceryStore.entities.CustomerDetails;
import com.example.groceryStore.repository.CustomerDetailRepository;
import com.example.groceryStore.service.CustomerDetailService;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService {

	@Autowired
	CustomerDetailRepository customerDetailRespository;
	
	
	@Override
	public CustomerDetails customerDetails(int id) {
		try {
		CustomerDetails customerDetails= customerDetailRespository.findByCustomerId(id);
		return customerDetails;
		}catch(Exception e) {
			throw e;
		}
	}

}
