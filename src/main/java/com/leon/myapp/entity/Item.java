package com.leon.myapp.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@RedisHash("Item")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Item implements Serializable {

   @Id
   private String itemId;
   private String itemName;
   private Double itemPrice;
   private Integer itemQty;
}
