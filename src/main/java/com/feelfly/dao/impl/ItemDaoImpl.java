package com.feelfly.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.feelfly.dao.ItemDAO;
import com.feelfly.model.Item;

@Repository
public class ItemDaoImpl extends GenericDaoImpl<Long, Item> implements ItemDAO {

	public ItemDaoImpl() {
		super(Item.class);
	}

	public ItemDaoImpl(Class<Item> entityClass) {
		super(entityClass);
	}

	private static final long serialVersionUID = 1L;

	@Transactional
	@Override
	public Item addItem(Item itemToAdd) {
		return saveOrUpdate(itemToAdd);
	}

}
