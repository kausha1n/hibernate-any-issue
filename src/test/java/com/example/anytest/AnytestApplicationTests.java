package com.example.anytest;

import com.example.anytest.model.PropertyHolder;
import com.example.anytest.repo.PropertyHolderRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.hibernate.Session;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnytestApplicationTests {
	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	PropertyHolderRepo propertyHolderRepo;

	@Test
	@Transactional
	void contextLoads() {
		Session session = entityManager.unwrap(Session.class);
		PropertyHolder ph = session.get(PropertyHolder.class, 1L);
		Assertions.assertNotNull(ph.getProperty());
	}

}
