package com.procedure.runner;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.procedure.repository.EmployeeRepository;
@Component
public class MyRunner implements CommandLineRunner {
@Autowired
EmployeeRepository empRepo;
	@Override
	public void run(String... args) throws Exception {
		Map<String,Object> map=empRepo.calcBonus(1006);
		System.out.println("Name="+map.get("name").toString());
		System.out.println("Bonus="+map.get("bonus").toString());

	}

}
