package com.bookstore.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

/**
 * @author CraftMojo
 */

public class UsersTest {

	public static void main(String[] args) {
		Users user1 = new Users();
		user1.setEmail("tika@hotmail.com");
		user1.setFullName("tika");
		user1.setPassword("423477234");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("Test: User sudah persisten");
		
	}
	

}
