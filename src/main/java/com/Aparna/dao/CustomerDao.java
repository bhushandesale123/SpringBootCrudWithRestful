package com.Aparna.dao;

import java.util.List;

import com.Aparna.model.Customer;

public interface CustomerDao {
	public abstract List<Customer> findAll();
	public abstract Customer findById(int customerId);
	public abstract void save(Customer customer);
	public abstract void deleteById(int customerId);
	public abstract void deleteAll();
	public abstract Customer update(Customer customer);
}
