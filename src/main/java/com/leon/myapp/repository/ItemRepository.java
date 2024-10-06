package com.leon.myapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leon.myapp.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, String>{

   
}
