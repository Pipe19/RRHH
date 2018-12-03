package Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Asistencia {
    @Id
    private Long ID;

    private Date Fecha;
    private String horaEntrada;
    private String horaSalida;
    private Justificante justificante;

}
