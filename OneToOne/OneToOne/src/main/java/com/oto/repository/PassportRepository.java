package com.oto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oto.entity.Passport;
@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
