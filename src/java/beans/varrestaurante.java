/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entities.Categoria;
import entities.Ingredientes;
import entities.Usuarios;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

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

    public boolean login(String email, String password) {
        EntityManager em = emf.createEntityManager();
        //TODO tenir en compte que ha de ser rol 1 (usuario)
        Usuarios encontrado = em.find(Usuarios.class, email);
        em.close();
        if (encontrado == null) {
            return false;
        } else {
            if (encontrado.getPassword().equals(password)) {
                if (encontrado.getRol() == false) {
                    return true;
                }
            }
            return false;
        }
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
        //Buscar lista por nombre
        EntityManager em = emf.createEntityManager();
        // Necessitem fer la consulta per nom
        Query q = em.createNamedQuery("Ingredientes.findByNombre");
        q.setParameter("nombre", i.getNombre());
        List<Ingredientes> resultado = q.getResultList();
        em.close();

        if (resultado.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public boolean insertCategoria(Categoria c) {
        if (!existCategoria(c)) {
            EntityManager em = emf.createEntityManager();
            em.persist(c);
            em.close();
            return true;
        }
        return false;
    }

    public boolean existCategoria(Categoria c) {
        //Buscar lista por nombre
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Categoria.findByNombre");
        q.setParameter("nombre", c.getNombre());
        List<Categoria> resultado = q.getResultList();

        em.close();

        if (resultado.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
        public List<Categoria> selectAllCategorias() {
        return emf.createEntityManager().createNamedQuery("Categoria.findAll").getResultList();
    }
}
