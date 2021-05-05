package entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass  //declaramos esta clase como superclase. Esta entidad la vamos a usar y mapear en Alumno y Profesor
public class Persona {

    @Id  //aplicamos ID a esta entidad
    @Column(name = "persona_id")  //declaramos un nombre a la columna
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //regla de autogeneración de la llave primaria que vamos a utilizar, en este caso de tipo auto_increment
    private long personaId;
    private String nombre;
    private String dni;

    public Persona() {
    }

    public Persona(long personaId, String nombre, String dni) {
        this.personaId = personaId;  //si vamos a añadir a nuestro constructor el campo personaId
        this.nombre = nombre;
        this.dni = dni;
    }

    public long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(long personaId) {
        this.personaId = personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
