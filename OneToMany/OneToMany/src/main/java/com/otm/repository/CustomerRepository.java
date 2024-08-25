package com.otm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.otm.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
@Query(value="select c.customer_id,c.customer_name,l.loan_id,l.amount from customer c right outer join loan l on c.customer_id=l.customerid_fk",nativeQuery=true)
	List<Object[]> findCustomersWithLoans();
}
