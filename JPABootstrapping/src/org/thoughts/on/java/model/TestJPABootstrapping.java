
package org.thoughts.on.java.model;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class TestJPABootstrapping {

	Logger log = Logger.getLogger(this.getClass().getName());

	@Test
	public void bootstrapping() {
		log.info("... bootstrapping ...");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.find(Book.class, 1L);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
