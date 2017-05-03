/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Ingredientes;
import entities.Usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author usu26
 */
@Stateless
public class varrestaurante {

    @PersistenceUnit
    EntityManagerFactory emf;

    public boolean insertUsuario(Usuarios u) {
        if (!existUsuario(u)) {
            EntityManager em = emf.createEntityManager();
            em.persist(u);
//        em.flush();   Para forzar que se haga ahora
            em.close();
            return true;
        }
        return false;
    }

    public boolean existUsuario(Usuarios u) {
        EntityManager em = emf.createEntityManager();
        Usuarios encontrado = em.find(Usuarios.class, u.getMail());
        em.close();
        return encontrado != null;
    }

    public boolean insertIngrediente(Ingredientes i) {
        if (!existIngrediente(i)) {
            EntityManager em = emf.createEntityManager();
            em.persist(i);
            em.close();
            return true;
        }
        return false;
    }

    public boolean existIngrediente(Ingredientes i) {
        //LO KE HA DIT LA MAR, buscar lista por nombre
        EntityManager em = emf.createEntityManager();
//        Usuarios encontrado = em.find(Usuarios.class, i.getMail());
        em.close();
//        return encontrado != null;
        return false;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
