/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author 53868459K
 */
@Entity
@Table(name = "plato_ingredientes")
@NamedQueries({
    @NamedQuery(name = "PlatoIngredientes.findAll", query = "SELECT p FROM PlatoIngredientes p"),
    @NamedQuery(name = "PlatoIngredientes.findByIdPlato", query = "SELECT p FROM PlatoIngredientes p WHERE p.platoIngredientesPK.idPlato = :idPlato"),
    @NamedQuery(name = "PlatoIngredientes.findByIdIngrediente", query = "SELECT p FROM PlatoIngredientes p WHERE p.platoIngredientesPK.idIngrediente = :idIngrediente"),
    @NamedQuery(name = "PlatoIngredientes.findByGramos", query = "SELECT p FROM PlatoIngredientes p WHERE p.gramos = :gramos"),
    @NamedQuery(name = "PlatoIngredientes.findByMililitros", query = "SELECT p FROM PlatoIngredientes p WHERE p.mililitros = :mililitros")})
public class PlatoIngredientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlatoIngredientesPK platoIngredientesPK;
    @Column(name = "gramos")
    private Integer gramos;
    @Column(name = "mililitros")
    private Integer mililitros;
    @JoinColumn(name = "id_ingrediente", referencedColumnName = "id_ingrediente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ingredientes ingredientes;
    @JoinColumn(name = "id_plato", referencedColumnName = "id_plato", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Platos platos;

    public PlatoIngredientes() {
    }

    public PlatoIngredientes(PlatoIngredientesPK platoIngredientesPK) {
        this.platoIngredientesPK = platoIngredientesPK;
    }

    public PlatoIngredientes(int idPlato, int idIngrediente) {
        this.platoIngredientesPK = new PlatoIngredientesPK(idPlato, idIngrediente);
    }

    public PlatoIngredientesPK getPlatoIngredientesPK() {
        return platoIngredientesPK;
    }

    public void setPlatoIngredientesPK(PlatoIngredientesPK platoIngredientesPK) {
        this.platoIngredientesPK = platoIngredientesPK;
    }

    public Integer getGramos() {
        return gramos;
    }

    public void setGramos(Integer gramos) {
        this.gramos = gramos;
    }

    public Integer getMililitros() {
        return mililitros;
    }

    public void setMililitros(Integer mililitros) {
        this.mililitros = mililitros;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Platos getPlatos() {
        return platos;
    }

    public void setPlatos(Platos platos) {
        this.platos = platos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (platoIngredientesPK != null ? platoIngredientesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlatoIngredientes)) {
            return false;
        }
        PlatoIngredientes other = (PlatoIngredientes) object;
        if ((this.platoIngredientesPK == null && other.platoIngredientesPK != null) || (this.platoIngredientesPK != null && !this.platoIngredientesPK.equals(other.platoIngredientesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PlatoIngredientes[ platoIngredientesPK=" + platoIngredientesPK + " ]";
    }
    
}
