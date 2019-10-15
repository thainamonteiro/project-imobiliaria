package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Clientes;
import model.Imoveis;

public class Dao<T> {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("segurado");
	EntityManager manager = factory.createEntityManager();

	public void create(Object dao) {

		try {

			verificarConexaoAberta();

			manager.getTransaction().begin();
			manager.persist(dao);
			manager.getTransaction().commit();
			System.out.println("Sucesso!");
//			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		}
	}

	private void verificarConexaoAberta() {
		if (!manager.isOpen()) {
			manager = factory.createEntityManager();
		}
	}

	public List<Clientes> listaClientes() {
		return this.manager.createQuery("SELECT c from Clientes c").getResultList();
	}

	public List<Imoveis> listaImoveis() {
		return this.manager.createQuery("SELECT i from Imoveis i").getResultList();
	}

	public void remove(Class<T> clazz, Integer id) {
		T t = findById(clazz, id);
		try {
			manager.getTransaction().begin();
			manager.remove(t);
			manager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		}
	}

	public void alterar(T obj) {
		try {
			manager.getTransaction().begin();
			manager.merge(obj);
			manager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		}
	}

	public T findById(Class<T> clazz, Integer id) {
		return manager.find(clazz, id);

	}

}