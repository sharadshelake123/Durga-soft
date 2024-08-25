package com.mto.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mto.entity.Customer;
import com.mto.entity.Loan;
import com.mto.repository.LoanRepository;
@Component
public class MyRunner implements CommandLineRunner {
@Autowired
LoanRepository loanRepo;
	@Override
	public void run(String... args) throws Exception {
		Customer customer=new Customer();
		customer.setCustomerId(1001);
		customer.setCustomerName("Sunil");
		
		Loan personal=new Loan();
		personal.setLoanId("LN-P121");
		personal.setLoanType("PERSONAL");
		personal.setAmount(20000.0);
		
		Loan home=new Loan();
		home.setLoanId("LN-H122");
		home.setLoanType("HOME");
		home.setAmount(300000.0);
		
		personal.setCustomer(customer);
		home.setCustomer(customer);
		
		loanRepo.save(personal);
		loanRepo.save(home);
	}

}
