package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "modulos")    //declaramos un nombre a la entidad
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "abreviatura", name = "unique_abreviatura")) //modificamos la tabla y asignamos al campo abreviatura tipo Unique
public class Modulo implements Serializable {

    @Id  //aplicamos ID a esta entidad
    @Column(name = "modulo_id")  //declaramos un nombre a la columna
    @GeneratedValue(strategy = GenerationType.IDENTITY) //regla de autogeneración de la llave primaria vamos a utilizar, en este caso de tipo auto_increment
    private long moduloId;
    private String nombre;
    private String abreviatura;

    public Modulo() {
    }

    public Modulo(String nombre, String abreviatura) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
    }

    public long getModuloId() {
        return moduloId;
    }

    public void setModuloId(long moduloId) {
        this.moduloId = moduloId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

}
