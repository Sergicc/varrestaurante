/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usu26
 */
@Entity
@Table(name = "reservas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservas.findAll", query = "SELECT r FROM Reservas r")
    , @NamedQuery(name = "Reservas.findByIdReserva", query = "SELECT r FROM Reservas r WHERE r.idReserva = :idReserva")
    , @NamedQuery(name = "Reservas.findByFecha", query = "SELECT r FROM Reservas r WHERE r.fecha = :fecha")
    , @NamedQuery(name = "Reservas.findByTurno", query = "SELECT r FROM Reservas r WHERE r.turno = :turno")
    , @NamedQuery(name = "Reservas.findByAforo", query = "SELECT r FROM Reservas r WHERE r.aforo = :aforo")
    , @NamedQuery(name = "Reservas.findByComensales", query = "SELECT r FROM Reservas r WHERE r.comensales = :comensales")})
public class Reservas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_reserva")
    private Integer idReserva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "turno")
    private Boolean turno;
    @Column(name = "aforo")
    private Integer aforo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "comensales")
    private int comensales;
    @Lob
    @Size(max = 65535)
    @Column(name = "comentario")
    private String comentario;
    @JoinColumn(name = "mail", referencedColumnName = "mail")
    @ManyToOne(optional = false)
    private Usuarios mail;

    public Reservas() {
    }

    public Reservas(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Reservas(Integer idReserva, Date fecha, int comensales) {
        this.idReserva = idReserva;
        this.fecha = fecha;
        this.comensales = comensales;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getTurno() {
        return turno;
    }

    public void setTurno(Boolean turno) {
        this.turno = turno;
    }

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuarios getMail() {
        return mail;
    }

    public void setMail(Usuarios mail) {
        this.mail = mail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReserva != null ? idReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservas)) {
            return false;
        }
        Reservas other = (Reservas) object;
        if ((this.idReserva == null && other.idReserva != null) || (this.idReserva != null && !this.idReserva.equals(other.idReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Reservas[ idReserva=" + idReserva + " ]";
    }
    
}
