package com.feelfly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feelfly.model.Item;
import com.feelfly.service.ItemService;

@RestController
public class ItemsController {

	@Autowired
	private ItemService itemService;

	@RequestMapping(name = "/items", method = RequestMethod.POST)
	public ResponseEntity<Item> addItem(@RequestBody Item itemToAdd) {

		Item savedItem = itemService.addItem(itemToAdd);

		return new ResponseEntity<Item>(savedItem, HttpStatus.CREATED);

	}

}
