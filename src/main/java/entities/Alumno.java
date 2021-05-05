package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity  //declaramos un nombre a la entidad
public class Alumno extends Persona implements Serializable {  //esta clase extiende de su clase "padre" Persona

    @OneToOne  //propiedad 1 a uno visto desde aquí, 1 alumno tiene 1 centro
    //creamos la relación entre nuestra tabla alumno y centro, con la foreing key
    @JoinColumn(name = "centro_id", referencedColumnName = "centro_id", foreignKey = @ForeignKey(name = "FK_alumno_centro"))
    private Centro centro;
    private int edad;

    public Alumno() {
    }

    public Alumno(Centro centro, int edad, long personaId, String nombre, String dni) {
        super(personaId, nombre, dni);
        this.centro = centro;
        this.edad = edad;
    }

    public Centro getCentro() {
        return centro;
    }

    public void setCentro(Centro centro) {
        this.centro = centro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
