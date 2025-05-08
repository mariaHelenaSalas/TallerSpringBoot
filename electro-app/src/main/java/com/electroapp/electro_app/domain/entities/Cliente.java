package com.electroapp.electro_app.domain.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Data
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 80, nullable = false)
    private String nombre;

   @Column(name="fecha_compra")
  private LocalDate fechaCompra;

  @Column(name="fecha_nacimiento", columnDefinition = "DATE")
  private LocalDate fechaNac;

}
