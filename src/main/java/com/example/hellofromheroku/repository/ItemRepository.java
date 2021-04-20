package com.example.hellofromheroku.repository;
/*
  @author   george
  @project   hellofromHeroku
  @class  ItemRepository
  @version  1.0.0 
  @since 20.04.2021 - 16.52
*/

import com.example.hellofromheroku.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
