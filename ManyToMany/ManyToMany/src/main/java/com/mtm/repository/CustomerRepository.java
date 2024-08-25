package com.mtm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtm.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
