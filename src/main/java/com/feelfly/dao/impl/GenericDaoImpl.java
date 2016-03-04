package com.feelfly.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.feelfly.dao.GenericDao;

public class GenericDaoImpl<PK, T> implements GenericDao<PK, T>, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext
	protected EntityManager entityManager;

	protected Class<T> entityClass;

	
	
	public GenericDaoImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@Override
	public void add(T entity) {
		entityManager.persist(entity);
	}

	@Override
	public List<T> getAll() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> criteria = cb.createQuery(entityClass);
		Root<T> category = criteria.from(entityClass);
		criteria.select(category);
		return entityManager.createQuery(criteria).getResultList();
	}

	@Override
	public T findById(PK id) {
		T entity = entityManager.find(entityClass, id);
		return entity;
	}

	@Override
	public T saveOrUpdate(T entity) {
		if (entity != null) {
			entity = entityManager.merge(entity);
		}
		return entity;
	}

	@Override
	public void delete(T entity) {
		entityManager.remove(entityManager.contains(entity) ? entity
				: entityManager.merge(entity));
	}

	@Override
	public void refresh(T entity) {
		try {
			entityManager.refresh(entity);
		} catch (Exception e) {

		}
	}
}
