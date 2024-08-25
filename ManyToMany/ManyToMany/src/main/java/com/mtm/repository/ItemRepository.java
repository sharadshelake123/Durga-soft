package com.mtm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtm.entity.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
