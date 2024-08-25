package com.oto.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oto.entity.Passport;
import com.oto.entity.Person;
import com.oto.repository.PassportRepository;
@Component
public class MyRunner implements CommandLineRunner {
@Autowired
PassportRepository repo;
	@Override
	public void run(String... args) throws Exception {
		Person p=new Person();
		p.setPersonId(1001);
		p.setPersonName("Durga");
		
		Passport passport=new Passport();
		passport.setPassportNo(435678);
		passport.setExpDate(LocalDate.of(2024, 12, 31));
		passport.setPerson(p);
		
		repo.save(passport);

	}

}
