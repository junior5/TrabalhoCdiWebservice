package br.univel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class ClienteDao {

	@Inject
	private EntityManager manager;

	public void save(Cliente cli) {
		this.manager.getTransaction().begin();
		this.manager.persist(cli);
		this.manager.getTransaction().commit();
	}

}