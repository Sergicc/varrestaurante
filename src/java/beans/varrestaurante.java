/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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
    
    public String login(String email, String password){
        
        if(email.equals(password)){
            return "Valid User!!!";
        }else{
            return "Invalid User!!!";
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
