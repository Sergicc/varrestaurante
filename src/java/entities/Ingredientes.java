/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usu26
 */
@Entity
@Table(name = "ingredientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingredientes.findAll", query = "SELECT i FROM Ingredientes i")
    , @NamedQuery(name = "Ingredientes.findByIdIngrediente", query = "SELECT i FROM Ingredientes i WHERE i.idIngrediente = :idIngrediente")
    , @NamedQuery(name = "Ingredientes.findByNombre", query = "SELECT i FROM Ingredientes i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Ingredientes.findBySolidoLiquido", query = "SELECT i FROM Ingredientes i WHERE i.solidoLiquido = :solidoLiquido")
    , @NamedQuery(name = "Ingredientes.findByGramosTotal", query = "SELECT i FROM Ingredientes i WHERE i.gramosTotal = :gramosTotal")
    , @NamedQuery(name = "Ingredientes.findByMililitrosTotal", query = "SELECT i FROM Ingredientes i WHERE i.mililitrosTotal = :mililitrosTotal")
    , @NamedQuery(name = "Ingredientes.findByPrecioKgL", query = "SELECT i FROM Ingredientes i WHERE i.precioKgL = :precioKgL")})
public class Ingredientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ingrediente")
    private Integer idIngrediente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "solido_liquido")
    private boolean solidoLiquido;
    @Column(name = "gramos_total")
    private Integer gramosTotal;
    @Column(name = "mililitros_total")
    private Integer mililitrosTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_kg_l")
    private double precioKgL;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingredientes")
    private Collection<PlatoIngredientes> platoIngredientesCollection;

    public Ingredientes() {
    }

    public Ingredientes(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public Ingredientes(Integer idIngrediente, String nombre, boolean solidoLiquido, double precioKgL) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.solidoLiquido = solidoLiquido;
        this.precioKgL = precioKgL;
    }

    public Integer getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getSolidoLiquido() {
        return solidoLiquido;
    }

    public void setSolidoLiquido(boolean solidoLiquido) {
        this.solidoLiquido = solidoLiquido;
    }

    public Integer getGramosTotal() {
        return gramosTotal;
    }

    public void setGramosTotal(Integer gramosTotal) {
        this.gramosTotal = gramosTotal;
    }

    public Integer getMililitrosTotal() {
        return mililitrosTotal;
    }

    public void setMililitrosTotal(Integer mililitrosTotal) {
        this.mililitrosTotal = mililitrosTotal;
    }

    public double getPrecioKgL() {
        return precioKgL;
    }

    public void setPrecioKgL(double precioKgL) {
        this.precioKgL = precioKgL;
    }

    @XmlTransient
    public Collection<PlatoIngredientes> getPlatoIngredientesCollection() {
        return platoIngredientesCollection;
    }

    public void setPlatoIngredientesCollection(Collection<PlatoIngredientes> platoIngredientesCollection) {
        this.platoIngredientesCollection = platoIngredientesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIngrediente != null ? idIngrediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ingredientes)) {
            return false;
        }
        Ingredientes other = (Ingredientes) object;
        if ((this.idIngrediente == null && other.idIngrediente != null) || (this.idIngrediente != null && !this.idIngrediente.equals(other.idIngrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Ingredientes[ idIngrediente=" + idIngrediente + " ]";
    }
    
}
