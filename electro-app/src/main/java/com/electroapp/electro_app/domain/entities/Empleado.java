package com.electroapp.electro_app.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;





@Getter
@Setter
@Table(name = "empleados")
@Entity
public class Empleado extends Persona {

  @Column(name="fecha_contrato", columnDefinition = "DATE", nullable=false)
  private LocalDate fechaContrato;

  @Column(name="salario", nullable=false)
  private double salario;

  @Column(name="fecha_nacimiento", columnDefinition = "DATE", nullable=false)
  private LocalDate fechaNac;

  @ManyToOne @JoinColumn(name="id_eps")
  private Eps epsEmpleado;

  @ManyToOne @JoinColumn(name="id_arl")
  private Arl arlEmpleado;

  @ManyToOne @JoinColumn(name="id_tipodoc")
  private TipoDocumento tipoDocumento;

}
