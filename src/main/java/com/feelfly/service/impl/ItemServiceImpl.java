package com.feelfly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feelfly.dao.ItemDAO;
import com.feelfly.model.Item;
import com.feelfly.service.ItemService;

@Service
public class ItemServiceImpl extends GenericServiceImpl<Long, Item> implements
		ItemService {

	@Autowired
	private ItemDAO dao;

	@Override
	public Item addItem(Item itemToAdd) {
		return dao.addItem(itemToAdd);
	}

}
