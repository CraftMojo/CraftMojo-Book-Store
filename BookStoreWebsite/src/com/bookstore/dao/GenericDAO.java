package com.bookstore.dao;

import java.util.List;

/**
 * @author CraftMojo
 * @param <T>
 */

public interface GenericDAO<T> {
	
	public T create(T t);
	
	public T update(T t);
	
	public T get(Object Id);
	
	public void delete(Object Id);
	
	public List<T> listAll();
	
	public long count();
	

}
