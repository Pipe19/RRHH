package Entidades;

import javax.persistence.*;

@Entity
@Table(name = "Documentos")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    private String Descripcion;
    private String URL;
    @ManyToOne()
    @JoinColumn(
            name = "documentos",
             referencedColumnName = "ID")
    private Persona Propietario;

}
