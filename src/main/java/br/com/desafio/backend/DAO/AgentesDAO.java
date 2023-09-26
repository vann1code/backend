package br.com.desafio.backend.DAO;

import br.com.desafio.backend.Model.Agentes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AgentesDAO {
    private EntityManagerFactory emf;

    public AgentesDAO() {
        emf = Persistence.createEntityManagerFactory("AgentesPersistenceUnit");
    }

    public void salvarAgentes(Agentes agentes) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(agentes);
        em.getTransaction().commit();
        em.close();
    }

    public void fechar() {
        emf.close();
    }
}