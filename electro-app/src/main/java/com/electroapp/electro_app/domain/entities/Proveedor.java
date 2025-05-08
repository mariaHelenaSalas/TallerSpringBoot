package com.electroapp.electro_app.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@Entity
@Table(name = "proveedores")
public class Proveedor extends Persona {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="dias_plazo",length = 50, columnDefinition = "INTEGER")
    private Integer diasPlazo;
  
    @Column(name="porcentaje_pronto_pago")
    private Double porcentajeProntoPago;

}
