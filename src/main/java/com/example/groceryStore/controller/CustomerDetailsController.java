package com.example.groceryStore.controller;

import com.example.groceryStore.constants.Constants;
import com.example.groceryStore.entities.CustomerDetails;
import com.example.groceryStore.model.CustomerDetailsResponse;
import com.example.groceryStore.repository.CustomerDetailRepository;
import com.example.groceryStore.service.CustomerDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerDetailsController {

	@Autowired
	CustomerDetailService customerDetailService;

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<Object> fetchFeedback(@PathVariable(name = "customerId") int customerId){
try {
        CustomerDetails customerDetails= customerDetailService.customerDetails(customerId);
        if(customerDetails== null) {
        	throw new Exception(Constants.NO_DETAILS_FOUND+customerId);
        }
        CustomerDetailsResponse customerDetailsResponse = 
        		new CustomerDetailsResponse(customerDetails.getCustomerId()
        		,customerDetails.getCustomerName()
        		,customerDetails.getBill());
        return new ResponseEntity<Object>(customerDetailsResponse,HttpStatus.OK);
}catch(Exception ex) {
	return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
}
    }

}
