package com.mtm.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mtm.entity.Customer;
import com.mtm.entity.Item;
import com.mtm.repository.CustomerRepository;
@Component
public class MyRunner implements CommandLineRunner {
@Autowired
CustomerRepository custRepo;
	@Override
	public void run(String... args) throws Exception {
		Customer c1=new Customer();
		c1.setCustomerId(1001);
		c1.setCustomerName("Sunil");
		Customer c2=new Customer();
		c2.setCustomerId(1002);
		c2.setCustomerName("Anil");
		
		Item i1=new Item();
		i1.setItemId(101);i1.setItemName("Laptop");
		Item i2=new Item();
		i2.setItemId(102);i2.setItemName("Mobile");
		Item i3=new Item();
		i3.setItemId(103);i3.setItemName("Key board");
		
		List<Item> itemlist1=new ArrayList<Item>();
		itemlist1.add(i1);itemlist1.add(i2);itemlist1.add(i3);
		
		List<Item> itemlist2=new ArrayList<Item>();
		itemlist2.add(i1);itemlist2.add(i2);
		
		c1.setItems(itemlist1);
		c2.setItems(itemlist2);
		
		custRepo.save(c1);
		custRepo.save(c2);
	}

}
