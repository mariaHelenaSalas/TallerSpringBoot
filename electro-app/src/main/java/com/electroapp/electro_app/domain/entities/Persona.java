package com.electroapp.electro_app.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;


@Data
@MappedSuperclass
public  abstract class Persona {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @Column(name="identificacion", length=20, nullable=false)
  private String identificacion;

  @Column(name="nombre", length=50, nullable=false)
  private String nombre;

  @Column(name="apellido", length=50, nullable=false)
  private String apellido;

  private String telefono;
  private String direccion;
  private String email;

}
