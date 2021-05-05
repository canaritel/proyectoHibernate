package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "centros")   //declaramos un nombre a la entidad
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "nombre", name = "unique_nombre"))   //modificamos la tabla y asignamos al campo nombre tipo Unique
public class Centro implements Serializable {

    @Id  //aplicamos ID a esta entidad
    @Column(name = "centro_id")   //declaramos un nombre a la columna
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //regla de autogeneración de la llave primaria que vamos a utilizar, en este caso de tipo auto_increment
    private long centroId;
    private String nombre;

    public Centro() {
    }

    public Centro(String nombre) {
        this.nombre = nombre;
    }

    public long getCentroId() {
        return centroId;
    }

    public void setCentroId(long centroId) {
        this.centroId = centroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
