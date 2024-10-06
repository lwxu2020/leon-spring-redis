package com.leon.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.leon.myapp.entity.Item;
import com.leon.myapp.repository.ItemRepository;

@SpringBootApplication
@EnableCaching
public class MyappApplication {
// public class MyappApplication implements CommandLineRunner {

	// @Autowired
	// private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	System.out.println("Saving");
	// 	Item i = Item.builder()
	// 					.itemId("id1")
	// 					.itemName("Chair")
	// 					.itemPrice(20.1)
	// 					.itemQty(2)
	// 					.build();

	// 	itemRepository.save(i);
	// 	System.out.println("Saved");

	// 	Item iget = itemRepository.findById("id1").get();
	// 	System.out.println("getting item with name " + iget.getItemName());
	// }

}
