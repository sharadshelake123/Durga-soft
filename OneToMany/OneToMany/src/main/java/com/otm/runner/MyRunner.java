package com.otm.runner;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.otm.entity.Customer;
import com.otm.entity.Loan;
import com.otm.repository.CustomerRepository;
import com.otm.repository.LoanRepository;
@Component
public class MyRunner implements CommandLineRunner {
@Autowired
CustomerRepository custRepo;
@Autowired
LoanRepository loanRepo;
@Transactional
	@Override
	public void run(String... args) throws Exception {
		/*Customer c1=new Customer();
		c1.setCustomerId(1001);
		c1.setCustomerName("Durga");
		
		Loan personal=new Loan();
		personal.setLoanId("LN-P121");
		personal.setLoanType("PERSONAL");
		personal.setAmount(20000.0);
		
		Loan home=new Loan();
		home.setLoanId("LN-H122");
		home.setLoanType("HOME");
		home.setAmount(300000.0);
		
		Set<Loan> loans=new HashSet<Loan>();
		loans.add(personal);
		loans.add(home);
		
		c1.setLoans(loans);
		custRepo.save(c1);*/
		//Customer customer=custRepo.findById(1001).get();
		/*Loan vehicle=new Loan();
		vehicle.setLoanId("LN-V365");
		vehicle.setLoanType("VEHICLE");
		vehicle.setAmount(30000.0);
		
		Customer customer=custRepo.findById(1001).get();
		Set<Loan> loans=customer.getLoans();
		loans.add(vehicle);*/
	/*Loan loan=loanRepo.findById("LN-V365").get();
	Customer customer=custRepo.findById(1001).get();
	Set<Loan> loans=customer.getLoans();
	Iterator<Loan> iterator=loans.iterator();
	while(iterator.hasNext())
	{
		Loan ln=iterator.next();
				if(ln.getLoanId().equals(loan.getLoanId()))
				{
					iterator.remove();
				}
	}*/
	List<Object[]> list=custRepo.findCustomersWithLoans();
	list.forEach(obj->{
		System.out.println(obj[0]+" "+obj[1]+" "+obj[2]+" "+obj[3]);
	});

	}

}
