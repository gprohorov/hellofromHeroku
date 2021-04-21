package com.example.hellofromheroku.service;

import com.example.hellofromheroku.model.Item;

import com.example.hellofromheroku.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
  @author   george
  @project   hellofromHeroku
  @class  ItemService
  @version  1.0.0 
  @since 20.04.2021 - 16.54
*/
@Service
public class ItemService {
    private List<Item> list = Stream.of(
            new Item("name1", "desc1"),
            new Item("name2", "desc2"),
            new Item("name3", "desc3")
    ).collect(Collectors.toList());

    @Autowired
    ItemRepository repository;

    @PostConstruct
    void init(){
        repository.saveAll(list);
    }

}
