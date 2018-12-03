package Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departamento {
    @Id
    private Long ID;

    private String Descripcion;
    private int noEmpleados;


}
