package com.leon.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.leon.myapp.entity.Item;
import com.leon.myapp.service.ItemService;

@RestController
public class ItemController {

   @Autowired
   private ItemService itemService;

   @GetMapping(path="/item/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
   public Item getItem(@PathVariable("id") String itemId) {
      return itemService.findById(itemId);
   }

   @PostMapping(path="/item")
   public Item save(@RequestBody Item item) {

      
      return itemService.save(item);
   }

   @PostMapping(path="/items")
   public Iterable<Item> saveItems(@RequestBody List<Item> items) {
      return itemService.saveItems(items);
   }

   @GetMapping(path="/items", produces=MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Item> listAll() {
      return itemService.findAll();
   }

   @DeleteMapping(path="/item/{id}")
   public void deleteById(@PathVariable("id") String id) {
      itemService.delete(id);
   }

   @DeleteMapping(path="/items") 
   public void deleteAll() {
      itemService.deleteAll();
   }   
}
