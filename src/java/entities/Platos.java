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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "platos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platos.findAll", query = "SELECT p FROM Platos p")
    , @NamedQuery(name = "Platos.findByIdPlato", query = "SELECT p FROM Platos p WHERE p.idPlato = :idPlato")
    , @NamedQuery(name = "Platos.findByNombre", query = "SELECT p FROM Platos p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Platos.findByPrecio", query = "SELECT p FROM Platos p WHERE p.precio = :precio")
    , @NamedQuery(name = "Platos.findByTipo", query = "SELECT p FROM Platos p WHERE p.tipo = :tipo")})
public class Platos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_plato")
    private Integer idPlato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo")
    private int tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "platos")
    private Collection<PlatoIngredientes> platoIngredientesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlato1")
    private Collection<Menu> menuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlato2")
    private Collection<Menu> menuCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlato3")
    private Collection<Menu> menuCollection2;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false)
    private Categoria idCategoria;

    public Platos() {
    }

    public Platos(Integer idPlato) {
        this.idPlato = idPlato;
    }

    public Platos(Integer idPlato, String nombre, double precio, int tipo) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Integer getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(Integer idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<PlatoIngredientes> getPlatoIngredientesCollection() {
        return platoIngredientesCollection;
    }

    public void setPlatoIngredientesCollection(Collection<PlatoIngredientes> platoIngredientesCollection) {
        this.platoIngredientesCollection = platoIngredientesCollection;
    }

    @XmlTransient
    public Collection<Menu> getMenuCollection() {
        return menuCollection;
    }

    public void setMenuCollection(Collection<Menu> menuCollection) {
        this.menuCollection = menuCollection;
    }

    @XmlTransient
    public Collection<Menu> getMenuCollection1() {
        return menuCollection1;
    }

    public void setMenuCollection1(Collection<Menu> menuCollection1) {
        this.menuCollection1 = menuCollection1;
    }

    @XmlTransient
    public Collection<Menu> getMenuCollection2() {
        return menuCollection2;
    }

    public void setMenuCollection2(Collection<Menu> menuCollection2) {
        this.menuCollection2 = menuCollection2;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlato != null ? idPlato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platos)) {
            return false;
        }
        Platos other = (Platos) object;
        if ((this.idPlato == null && other.idPlato != null) || (this.idPlato != null && !this.idPlato.equals(other.idPlato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Platos[ idPlato=" + idPlato + " ]";
    }
    
}
