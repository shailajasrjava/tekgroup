package com.tek.customer.dao;

import com.tek.customer.model.Customer;

public interface CustomerDAO {
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
