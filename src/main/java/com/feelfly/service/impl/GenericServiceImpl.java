package com.feelfly.service.impl;

import java.util.List;

import com.feelfly.dao.GenericDao;
import com.feelfly.service.GenericService;

public class GenericServiceImpl<PK, T> implements GenericService<PK, T> {

	private GenericDao<PK, T> genericDao;

	public GenericServiceImpl() {
	}

	public void setGenericDao(GenericDao<PK, T> genericDao) {
		this.genericDao = genericDao;
	}

	public GenericDao<PK, T> getGenericDao() {
		return this.genericDao;
	}

	@Override
	public List<T> getAll() {
		return genericDao.getAll();
	}

	@Override
	public void add(T entity) {
		genericDao.add(entity);
	}

	@Override
	public T findById(PK id) {
		return genericDao.findById(id);
	}

	@Override
	public T saveOrUpdate(T entity) {
		if (entity != null) {
			entity = genericDao.saveOrUpdate(entity);
		}
		return entity;
	}

	@Override
	public void delete(T entity) {
		genericDao.delete(entity);
	}

	@Override
	public void refresh(T entity) {
		genericDao.refresh(entity);
	}

}