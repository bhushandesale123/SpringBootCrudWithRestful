package com.Aparna.service;

import java.util.List;

import com.Aparna.model.Customer;

public interface ServiceI {
	public abstract List<Customer> findAll();
	public abstract Customer findById(int customerId);
	public abstract void save(Customer Customer);
	public abstract void deleteById(int customerId);
	public abstract void deleteAll();
	public abstract Customer update(Customer customer); 
}
