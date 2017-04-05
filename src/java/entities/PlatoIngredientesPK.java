/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author usu26
 */
@Embeddable
public class PlatoIngredientesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_plato")
    private int idPlato;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ingrediente")
    private int idIngrediente;

    public PlatoIngredientesPK() {
    }

    public PlatoIngredientesPK(int idPlato, int idIngrediente) {
        this.idPlato = idPlato;
        this.idIngrediente = idIngrediente;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPlato;
        hash += (int) idIngrediente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlatoIngredientesPK)) {
            return false;
        }
        PlatoIngredientesPK other = (PlatoIngredientesPK) object;
        if (this.idPlato != other.idPlato) {
            return false;
        }
        if (this.idIngrediente != other.idIngrediente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PlatoIngredientesPK[ idPlato=" + idPlato + ", idIngrediente=" + idIngrediente + " ]";
    }
    
}
