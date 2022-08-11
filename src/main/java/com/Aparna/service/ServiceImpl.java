package com.Aparna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Aparna.dao.CustomerDao;
import com.Aparna.model.Customer;
@Service
public class ServiceImpl implements ServiceI {
	@Autowired
private CustomerDao customerDao;
	
	@Override
	
	public List<Customer> findAll() {
		List<Customer> findAll = customerDao.findAll();
		return findAll;
	}

	@Override
	public Customer findById(int customerId) {
		Customer findById = customerDao.findById(customerId);
		return findById;
	}

	@Override
	public void save(Customer Customer) {
		customerDao.save(Customer);
	}

	@Override
	public void deleteById(int customerId) {
		customerDao.deleteById(customerId);
		
	}

	@Override
	public void deleteAll() {
		customerDao.deleteAll();
		
	}

	@Override
	public Customer update(Customer customer) {
		Customer update = customerDao.update(customer);
		return update;
	}

}
