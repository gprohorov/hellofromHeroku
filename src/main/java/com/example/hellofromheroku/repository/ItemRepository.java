package com.example.hellofromheroku.repository;

import com.example.hellofromheroku.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
  @author   george
  @project   hellofromHeroku
  @class  ItemRepository
  @version  1.0.0 
  @since 21.04.2021 - 12.56
*/
@Repository
public interface ItemRepository extends MongoRepository<Item, String> {

}
