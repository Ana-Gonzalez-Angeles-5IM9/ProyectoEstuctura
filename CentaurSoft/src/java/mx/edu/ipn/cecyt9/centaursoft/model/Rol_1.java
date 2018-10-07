package mx.edu.ipn.cecyt9.centaursoft.model;

import java.io.Serializable;
import java.util.Collection;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ana
 */

public class Rol_1 implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Integer idrol;
    private String rol;
    private Collection<Usuario_1> usuarioCollection;

    public Rol_1() {
    }

    public Rol_1(Integer idrol) {
        this.idrol = idrol;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @XmlTransient
    public Collection<Usuario_1> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario_1> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrol != null ? idrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol_1)) {
            return false;
        }
        Rol_1 other = (Rol_1) object;
        if ((this.idrol == null && other.idrol != null) || (this.idrol != null && !this.idrol.equals(other.idrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.cenatursoft.model.Rol_1[ idrol=" + idrol + " ]";
    }    
}