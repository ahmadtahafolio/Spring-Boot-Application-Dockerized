package com.example.groceryStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.groceryStore.entities.CustomerDetails;

@Repository
public interface CustomerDetailRepository extends JpaRepository<CustomerDetails,Integer> {

    public CustomerDetails findByCustomerId(int customerId);

}
