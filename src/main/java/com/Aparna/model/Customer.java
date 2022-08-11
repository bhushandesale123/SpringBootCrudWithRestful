package com.Aparna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int customerId;
private String customerFname;
private String customerLname;
private String customerMobile;
private String customerEmail;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerFname() {
	return customerFname;
}
public void setCustomerFname(String customerFname) {
	this.customerFname = customerFname;
}
public String getCustomerLname() {
	return customerLname;
}
public void setCustomerLname(String customerLname) {
	this.customerLname = customerLname;
}
public String getCustomerMobile() {
	return customerMobile;
}
public void setCustomerMobile(String customerMobile) {
	this.customerMobile = customerMobile;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerFname=" + customerFname + ", customerLname="
			+ customerLname + ", customerMobile=" + customerMobile + ", customerEmail=" + customerEmail + "]";
}


}
