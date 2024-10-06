package com.leon.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leon.myapp.entity.Item;
import com.leon.myapp.repository.ItemRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Service
public class ItemService {

   @Autowired
   private ItemRepository itemRepository;

   public Item findById(String id) {
      Item item =  itemRepository.findById(id).orElse(null);
      return item;
   }

   public Item save(Item item) {
      return itemRepository.save(item);
   }

   public Iterable<Item> saveItems(Iterable<Item> items) {
      return itemRepository.saveAll(items);
   }

   public void delete(String id) {
      itemRepository.deleteById(id);
   }

   public void deleteAll() {
      itemRepository.deleteAll();
   }

   public Iterable<Item> findAll() {
      return itemRepository.findAll();
   }
}
