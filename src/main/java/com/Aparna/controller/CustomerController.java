package com.Aparna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Aparna.model.Customer;
import com.Aparna.service.ServiceI;
import com.Aparna.service.ServiceImpl;

@RestController
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private ServiceI serviceI;
	//Save
	@PostMapping("/save")
public ResponseEntity<Customer> getEmployeeSave(@RequestBody Customer customer) {
	serviceI.save(customer);
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}
	//find all
	@GetMapping("/getAllEmp")
public ResponseEntity<List<Customer>> getAllEmployeeList(){
	List<Customer> findAll = serviceI.findAll();
	return new ResponseEntity<>(findAll,HttpStatus.OK);
	}
	//get by id
	@GetMapping("/getById")
	public ResponseEntity<Customer> getById(@PathVariable int customerId){
		 Customer findById = serviceI.findById(customerId);
		return new 	ResponseEntity<>(findById,HttpStatus.OK);
		
	}
	//delete by id
	@GetMapping(value="/delete/{customerId}")
	public ResponseEntity<String> deleteById(@PathVariable int customerId){
		Customer findById = serviceI.findById(customerId);
		if(findById==null) {
			return new ResponseEntity<>("EmployeeId is not found" +customerId,HttpStatus.BAD_REQUEST);
		}
		serviceI.deleteById(customerId);
		return new ResponseEntity<>("Delete customer Id" + customerId,HttpStatus.OK);
		
	}
	//update
	@GetMapping("/udpatecustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
		serviceI.save(customer);
		return new ResponseEntity<>(customer,HttpStatus.OK);
		
	}
	
	}